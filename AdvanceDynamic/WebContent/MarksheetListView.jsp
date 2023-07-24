<%@page import="in.co.rays.bean.MarksheetBean"%>
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
	<form action="MarksheetListCtl">
		<%
			List list = (List) request.getAttribute("list");

			Iterator it = list.iterator();
		%>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>RollNo</th>
				<th>Physics</th>
				<th>Chemistry</th>
				<th>maths</th>
			</tr>

			<%
				while (it.hasNext()) {

					MarksheetBean bean = (MarksheetBean) it.next();
			%>
			<tr>
				<td><%=bean.getId()%></td>
				<td><%=bean.getName()%></td>
				<td><%=bean.getRollNo()%></td>
				<td><%=bean.getPhysics()%></td>
				<td><%=bean.getChemistry()%></td>
				<td><%=bean.getMaths()%></td>



			</tr>



			<%
				}
			%>



		</table>
	</form>
</body>
</html>