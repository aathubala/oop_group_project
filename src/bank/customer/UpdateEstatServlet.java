package bank.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateEstatServlet")
public class UpdateEstatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String cno = request.getParameter("cno");
		String name = request.getParameter("name");
		String cvn = request.getParameter("cvn");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		BankFactory bankFactory = new BankFactory();
		Bank ob = bankFactory.getBank("Estat");
		
		boolean isTrue;
		isTrue = ob.estatupdate(id, cno, name, cvn, email, phone);
		
		if(isTrue == true) {	
			List<Estatement> estatDetails = ob.getestatDetails(id);
			request.setAttribute("estatDetails", estatDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("estataccount.jsp");
			dis.forward(request, response);
		}else {
			List<Estatement> estatDetails = ob.getestatDetails(id);
			request.setAttribute("estatDetails", estatDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("estataccount.jsp");
			dis.forward(request, response);
		}
	}

}
