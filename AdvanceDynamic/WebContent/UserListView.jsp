<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

       <form action="UserListCtl" method="post">
       
       <%@ include file="Header.jsp"%>

		<%
			List list = (List) request.getAttribute("list");

			Iterator it = list.iterator();
		%>
		   	<table>
		     
		<tr>
		<td><input type="text"  name="firstName" placeholder="Enter firstName">
		 <td><input type="text" name="dob">
		</td>
		<td> <input type="submit" name="operation" value="search" ></td>
		</tr>
		
		</table>
		   
		
				<table border="1">
			<tr>
				<th>Id</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>LoginId</th>
				<th>Password</th>
				<th>DOB</th>
				<th>Address</th>
				<th>Edit</th>
			</tr>
           <tr></tr>


			<%
				while (it.hasNext()) {

					UserBean bean = (UserBean) it.next();
			%>

			<tr>
				<td><%=bean.getId()%></td>
				<td><%=bean.getFirstName()%></td>
				<td><%=bean.getLastName()%></td>
				<td><%=bean.getLoginId()%></td>
				<td><%=bean.getPassword()%></td>
				<td><%=bean.getDob()%></td>
				<td><%=bean.getAddress()%></td>
				<td><a href="UserCtl?id=<%=bean.getId()%>">edit</a></td>	
			</tr>

			<%
				}
			%>
				


		</table>

	</form>

</body>
</html>
         
         
       
       
       
     