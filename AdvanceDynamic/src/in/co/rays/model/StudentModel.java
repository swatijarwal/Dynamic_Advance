package in.co.rays.model;

import java.sql.*;

import in.co.rays.bean.StudentBean;
import in.co.rays.utility.JDBCDataSource;
import java.util.*;

public class StudentModel {

	public static void add(StudentBean bean) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into studentmanagement values(?,?,?,?,?,?)");
		// int i = ps.executeUpdate();
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setString(3, bean.getLoginId());
		ps.setInt(4, bean.getPassword());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6, bean.getAddress());
		int i = ps.executeUpdate();
		System.out.println(i);

	}

	public static void update(StudentBean bean) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("update student set name=? where id=?");
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getId());

		int i = ps.executeUpdate();
		System.out.println(i);
	}

	public static void delete(int id) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("delete from studentmanagement where id=?");
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		System.out.println(i);

	}

	public static StudentBean findByRoll(int id) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from studentmanagement where id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		StudentBean bean = null;
		while (rs.next()) {
			bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setLoginId(rs.getString(3));
			bean.setPassword(rs.getInt(4));
			bean.setDob(rs.getDate(5));
			bean.setAddress(rs.getString(6));
		}
		return bean;

	}

	public static List search(StudentBean bean) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		StringBuffer sql = new StringBuffer(" select* from studentmanagement where 1=1");
		// StudentBean bean = new StudentBean();
		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" and id like " + bean.getId());
			}
			if (bean.getName() != null && bean.getName().length()>0) {
				sql.append(" and name like '" + bean.getName() + "%'");
			}
			

		}
		System.out.println(sql);
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();
		while (rs.next()) {
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setLoginId(rs.getString(3));
			bean.setPassword(rs.getInt(4));
			bean.setDob(rs.getDate(5));
			bean.setAddress(rs.getString(6));
			list.add(bean);
		}
		return list;

	}

}
