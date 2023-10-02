package bank.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteEstatServlet")
public class DeleteEstatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		BankFactory bankFactory = new BankFactory();
		Bank ob = bankFactory.getBank("Estat");
		boolean isTrue;
		isTrue = ob.estatdelete(id);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("estatement insert.jsp");
			dis.forward(request, response);
		}else {
			List<Estatement> estatDetails = ob.getestatDetails(id);		
			request.setAttribute("estatDetails", estatDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("estataccount.jsp");
			dis.forward(request, response);
		}
	}

}
