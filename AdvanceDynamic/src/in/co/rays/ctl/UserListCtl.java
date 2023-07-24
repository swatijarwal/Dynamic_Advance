package in.co.rays.ctl;

import java.io.IOException;
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
@WebServlet("/UserListCtl")
public class UserListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserModel model = new UserModel();

		try {
			List list = model.search(null, 0, 0);

			req.setAttribute("list", list);

			RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("post");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String firstName = req.getParameter("firstName");
		String dob = req.getParameter("dob");

		String op = req.getParameter("operation");
           
		if (op.equals("search")) {
			try {
				UserBean bean = new UserBean();
				bean.setFirstName(firstName);
				if (!(dob.equals(""))) {
					bean.setDob(sdf.parse(dob));
				}

				UserModel model = new UserModel();

				List list = model.search(bean, 0, 0);

				req.setAttribute("list", list);

				RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
				rd.forward(req, resp);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}