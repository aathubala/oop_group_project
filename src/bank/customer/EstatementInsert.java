package bank.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EstatementInsert")
public class EstatementInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cno = request.getParameter("cno");
		String name = request.getParameter("name");
		String cvn = request.getParameter("cvn");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		BankFactory bankFactory = new BankFactory();
		Bank ob = bankFactory.getBank("Estat");
		
		boolean isTrue;		
		isTrue = ob.insertestatement(cno, name, cvn, email, phone);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("esuccess.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("eunsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
