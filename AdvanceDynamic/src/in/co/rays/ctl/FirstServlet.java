package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		     String firstName=   req.getParameter("firstName");
		     String lastName=   req.getParameter("lastName");
		     String loginId=   req.getParameter("loginId");
		     String password=   req.getParameter("password");
		     String address=   req.getParameter("address");
		 
		     System.out.print("\t" +firstName);
		     System.out.print("\t" +lastName);
		     System.out.print("\t" +loginId);
		     System.out.print("\t" +password);
		     System.out.println("\t" +address);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
