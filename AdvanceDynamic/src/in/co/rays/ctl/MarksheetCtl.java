package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;
@WebServlet("/MarksheetCtl")
public class MarksheetCtl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		                String name=    req.getParameter("name");
		                String rollNo= req.getParameter("rollNo");
		                String physics= req.getParameter("physics");
		                String chemistry = req.getParameter("chemistry");
		                String maths = req.getParameter("maths");
		                  
		                 MarksheetBean bean = new MarksheetBean();
		                 bean.setName(name);
		                 bean.setRollNo(Integer.parseInt(rollNo));
		                 bean.setPhysics(Integer.parseInt(physics));
		                 bean.setChemistry(Integer.parseInt(chemistry));
		                 bean.setMaths(Integer.parseInt(maths));
		                  MarksheetModel    model = new MarksheetModel();
		                  try {
							model.add(bean);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                  
		                 
		
			}
                        
}
