package bank.customer;

import java.util.HashMap;
import java.util.List;

public interface Bank {
	boolean insertestatement(String cno, String name, String cvn, String email, String phone);
	List<Estatement> estatview(String cno);
	boolean estatupdate(String id, String cno, String name, String cvn, String email, String phone);
	List<Estatement> getestatDetails(String id);
	boolean estatdelete(String id);
	double calculator(int time, double amount, String type);
	HashMap<String, Double> rateview();
	boolean updatetransferfund(String accno, double amount, String accnum);
}
