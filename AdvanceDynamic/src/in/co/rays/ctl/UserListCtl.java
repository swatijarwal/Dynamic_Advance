package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserListCtl.do")
public class UserListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserModel model = new UserModel();
		int pageNo = 1;
		int pageSize = 5;
		UserBean bean = new UserBean();

		try {

			List list = model.search(bean, pageNo, pageSize);

			req.setAttribute("list", list);
			req.setAttribute("pageNo", pageNo);
			req.setAttribute("pageSize", pageSize);

			RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		int pageSize = 5;

		String op = req.getParameter("operation");
		int pageNo = Integer.parseInt(req.getParameter("pageNo"));
		System.out.println(pageNo);
		System.out.println(pageSize);
		if (op.equals("next")) {
			pageNo++;
		}
		if (op.equals("previous")) {
			pageNo--;
		}
		
		if (op.equals("search")) {
			
			String firstName= req.getParameter("firstName");
			String dob= req.getParameter("dob");
			bean.setFirstName(firstName);
			try {
				bean.setDob(sdf.parse(dob));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
                try {
				     List list=	model.search(bean, pageNo, pageSize);
					
					    req.setAttribute("list", list);
					    req.setAttribute("pageNo", pageNo);
					    req.setAttribute("pagesize", pageSize);
					    
					    RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
					    rd.forward(req, resp);
				} catch (Exception e) {
				
					e.printStackTrace();
				}
                
                
	}

}
