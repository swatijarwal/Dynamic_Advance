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
		     UserBean bean = (UserBean) request.getAttribute("bean");
		    String st= (String) request.getAttribute("msg");
		    String st1 =(String)                    request.getAttribute("msg");
		%>


		<form action="UserCtl" method="post">

			<%@ include file="Header.jsp"%>
			<h1>UpdateUser</h1>


			<table>
		           <tr>
					<td>	<input type="hidden"  name="id" value="<%=bean.getId()%>">	</td>
						</tr>
			
							<tr>
							<th>First Name*</th>
							<td><input type="text" name="firstName" value="<%=bean.getFirstName()%>"></td>
						</tr>
						<tr>
							<th>Last Name*</th>
							<td><input type="text" name="lastName" value="<%=bean.getLastName()%>"></td>
						</tr>
						<tr>
							<th>LoginId*</th>
							<td><input type="text" name="loginId"
								placeholder="Must be Email ID" value="<%=bean.getLoginId()%>"></td>
						</tr>
						<tr>
							<th>Password*</th>
							<td><input type="password" name="password" value="<%=bean.getPassword()%>"></td>
						</tr>


						<tr>
							<th>Date Of Birth*</th>
							<td><input type="date" name="dob" value="<%=bean.getDob()%>"></td>
						</tr>
						<tr>
							<th>Address</th>
							<td><input type="text" name="address" value="<%=bean.getAddress()%>"></td>
						</tr>
						<tr>
							<td align="right" colspan="2"><input type="submit"
								name="operation" value="Update">
								<input type="submit"
								name="operation" value="add">
								<input type="submit"
								name="operation" value="delete">
								
								</td>
								
						</tr>
					</table>
					<%@ include file="Footer.jsp"%>
				</form>
	</center>
</table>
</form>
</body>
</html>