<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
		<%
			String msg = (String) request.getAttribute("msg");
		%>


		<form action="UserCtl" method="post">

			<%@ include file="Header.jsp"%>
			<h1>User Registration</h1>


			<table>
		           <tr>
							<%
								if (msg != null) {
							%>
							<%=msg%>
							<%
								}
							%>
						</tr>
			
							<tr>
							<th>First Name*</th>
							<td><input type="text" name="firstName" value=""></td>
						</tr>
						<tr>
							<th>Last Name*</th>
							<td><input type="text" name="lastName" value=""></td>
						</tr>
						<tr>
							<th>LoginId*</th>
							<td><input type="text" name="loginId"
								placeholder="Must be Email ID" value=""></td>
						</tr>
						<tr>
							<th>Password*</th>
							<td><input type="password" name="password" value=""></td>
						</tr>


						<tr>
							<th>Date Of Birth*</th>
							<td><input type="date" name="dob" id="dateofbirth"></td>
						</tr>
						<tr>
							<th>Address</th>
							<td><input type="text" name="address" value=""></td>
						</tr>
						<tr>
							<td align="right" colspan="2"><input type="submit"
								name="operation" value="add"></td>
						</tr>
					</table>
					<%@ include file="Footer.jsp"%>
				</form>
	</center>
</table>
</form>
</body>
</html>
