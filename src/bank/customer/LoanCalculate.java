package bank.customer;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoanCalculate")
public class LoanCalculate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int time = Integer.parseInt(request.getParameter("time"));	
		double amount = Double.parseDouble(request.getParameter("amount"));
		String type = request.getParameter("type");
		
		BankFactory bankFactory = new BankFactory();
		Bank ob = bankFactory.getBank("Estat");
		
		try{
			double fee = ob.calculator(time, amount, type);
			request.setAttribute("fee", fee);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("calcvalue.jsp");
		dis.forward(request, response);
	}

}
