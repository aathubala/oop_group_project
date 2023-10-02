package bank.customer;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
			String accno = request.getParameter("accno");
			String accnum = request.getParameter("accnum");
			double amount = Double.parseDouble(request.getParameter("amount"));
			
			BankFactory bankFactory = new BankFactory();
			Bank ob = bankFactory.getBank("Estat");
			
			boolean isTrue;
			isTrue = ob.updatetransferfund(accno, amount, accnum);
	
			if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("esuccess.jsp");
				dis.forward(request, response);
			}else {
				RequestDispatcher dis = request.getRequestDispatcher("ewarning.jsp");
				dis.forward(request, response);
			}
		}catch(NumberFormatException e) {
			RequestDispatcher dis = request.getRequestDispatcher("eunsuccess.jsp");
			dis.forward(request, response);
		}
		

		
	}
}
