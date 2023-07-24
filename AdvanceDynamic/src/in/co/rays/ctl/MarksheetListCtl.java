package in.co.rays.ctl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;
@WebServlet("/MarksheetListCtl")
public class MarksheetListCtl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		     
		    
		      MarksheetModel model = new MarksheetModel();
		   try {
			            List list =   (List) model.search(null, 0, 0);
			             
			            req.setAttribute("list", list);
			 RequestDispatcher rd= req.getRequestDispatcher("MarksheetListView.jsp");
			   rd.forward(req, resp);
			      
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		      
		      
		
		 
		
			}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		      String name=    req.getParameter("name");
		
			}

}
