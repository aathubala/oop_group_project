package bank.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerDBUtil implements Bank{
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	public boolean insertestatement(String cno, String name, String cvn, String email, String phone) {   //insert query of e-statement data
		
		isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into estatement values(0, '"+cno+"', '"+name+"', '"+cvn+"', '"+email+"', '"+phone+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return isSuccess;		
	}
	
	
	public List<Estatement> estatview(String cno){                       //view e-statement details
		
		ArrayList<Estatement> es = new ArrayList<>();
		
		//validate
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from estatement where cardnumber='"+cno+"'";			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String ecno = rs.getString(2);
				String name = rs.getString(3);
				String cvn = rs.getString(4);
				String email = rs.getString(5);
				String phone = rs.getString(6);
				
				Estatement estat = new Estatement(id, ecno, name, cvn, email, phone);
				es.add(estat);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return es;
	}
	
	
	public boolean estatupdate(String id, String cno, String name, String cvn, String email, String phone) {//update e-statement
		
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update estatement set cardnumber='"+cno+"', holdername='"+name+"', cvn='"+cvn+"', email='"+email+"', phone='"+phone+"' where eid='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public List<Estatement> getestatDetails(String id){ 
		
		int convertedID = Integer.parseInt(id);
		
		ArrayList<Estatement> es = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from estatement where eid='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int Id = rs.getInt(1);
				String cno = rs.getString(2);
				String name = rs.getString(3);
				String cvn = rs.getString(4);
				String email = rs.getString(5);
				String phone = rs.getString(6);
				
				Estatement c = new Estatement(Id, cno, name, cvn, email, phone);
				es.add(c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return es;
	}
	
	
	public boolean estatdelete(String id) {                                 //delete e-statement 
		
		int convID = Integer.parseInt(id);
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from estatement where eid='"+convID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
	public double calculator(int time, double amount, String type) {
		
		double fee = 0;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from calculator where loantype='"+type+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				double rate = rs.getDouble(3);
				
				Calculator c = new Calculator();
				fee = c.installmentfee(rate, time, amount);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return fee;
	}
	
	
public HashMap<String, Double> rateview(){           //rates table for loan types
		
	HashMap<String, Double> cal = new HashMap<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select loantype, rate from calculator";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String type = rs.getString(1);
				double rate = rs.getDouble(2);
				
				
				cal.put(type, rate);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cal;
	}

	public boolean updatetransferfund(String accno, double amount, String accnum) {
	
	isSuccess = false;
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		
		//reduction
		String sql3 = "select accountbalance from bankaccountdata where accountnumber='"+accnum+"'";
		rs = stmt.executeQuery(sql3);
		
		
		double amount2 = 0;
		if(rs.next()) {
			double balance2 = rs.getDouble(1);
			amount2 = balance2 - amount;
		}
		if(amount2<0) {
			isSuccess = false;
			
		}
		else{
			//addition
			String sql = "select accountbalance from bankaccountdata where accountnumber='"+accno+"'";
			rs = stmt.executeQuery(sql);
			
			
			double amount1 = 0;
			if(rs.next()) {
				double balance = rs.getDouble(1);
				amount1 = amount + balance;
			}
			
			String sql2 = "update bankaccountdata set accountbalance='"+amount1+"' where accountnumber='"+accno+"'";
			int rs2 = stmt.executeUpdate(sql2);
			
			if(rs2 > 0) {
				isSuccess = true;
				String sql4 = "update bankaccountdata set accountbalance='"+amount2+"' where accountnumber='"+accnum+"'";
				stmt.executeUpdate(sql4);
			}else {
				isSuccess = false;
			}
		}
	

	}catch(Exception e) {
		e.getStackTrace();
	}
	
	return isSuccess;		
	}
}
