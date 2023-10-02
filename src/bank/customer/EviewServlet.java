package bank.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EviewServlet")
public class EviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cno = request.getParameter("cno");
		
		BankFactory bankFactory = new BankFactory();
		Bank ob = bankFactory.getBank("Estat");
		
		
		try{
			List<Estatement> estatDetails = ob.estatview(cno);
			request.setAttribute("estatDetails", estatDetails);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("estataccount.jsp");
		dis.forward(request, response);
	}

}
