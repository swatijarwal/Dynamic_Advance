package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/Second","/Scnd","/Two","*.ctl","/Do"})
public class SecondServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 String firstName=   req.getParameter("firstName");
	     String lastName=   req.getParameter("lastName");
	     String loginId=   req.getParameter("loginId");
	     String password=   req.getParameter("password");
	     String[] address=   req.getParameterValues("address");
	     
	   
	     
	     resp.setContentType("text/html");
	    PrintWriter out=   resp.getWriter();
	    out.print("<h1>hello</h1>");
	  out.print(firstName+" "+lastName+" "+address[0]+" "+address[1]);
		  out.close();
}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
}
}