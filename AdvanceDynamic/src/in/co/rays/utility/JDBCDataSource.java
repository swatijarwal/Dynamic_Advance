package in.co.rays.utility;


import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javax.sql.CommonDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource{

	// JDBC Dtatasource static object

	private static JDBCDataSource jds = null;

	// C3PO database connection pool
	private ComboPooledDataSource ds = null;
	ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app");

	//ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Bundle.app");
	// Make default constructor private
	private JDBCDataSource() {
		try {
			// create data source
			ds = new ComboPooledDataSource();

			// set DS Properties
			ds.setDriverClass(rb.getString("driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("user"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(Integer.parseInt(rb.getString("initial")));
			ds.setAcquireIncrement(Integer.parseInt(rb.getString("acquire")));
			ds.setMaxPoolSize(Integer.parseInt(rb.getString("maximum")));

		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}

	}

	// get singleton class instance
	public static JDBCDataSource getInstance() {

		if (jds == null) {
			jds = new JDBCDataSource();

		}
		return jds;
	}

	// get connection from DCP
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
			
	
		}catch(

	SQLException e)
	{
		return null;
	}
	}

	// Close connection
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		
		try {
			if(rs != null)rs.close(); 
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	    }

	// Close connection
	public static void closeConnection(Connection conn, Statement stmt) {

		closeConnection(conn, stmt, null);
	}

	// Close connection
	public static void closeConnection(Connection conn) {
		closeConnection(conn, null, null);
	}

}

		  
			  
		  
	   


