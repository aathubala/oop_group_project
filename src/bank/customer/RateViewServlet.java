package bank.customer;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RateViewServlet")
public class RateViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BankFactory bankFactory = new BankFactory();
		Bank ob = bankFactory.getBank("Estat");
		
		try {
			HashMap<String, Double> rateDetails = ob.rateview();
			request.setAttribute("rateDetails", rateDetails);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("rateshow.jsp");
		dis.forward(request, response);
	}

}
