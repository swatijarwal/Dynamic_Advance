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
         <form action="LoginIdCtl" method="post">
         <%@ include file="Header.jsp"%>
         
         
         <%
			String msg = (String) request.getAttribute("msg");
		%>
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
					<th>LoginId*</th>
					<td><input type="text" name="loginId" value=""></td>
				</tr>
				<tr>
					<th>Password*</th>
					<td><input type="password" name="password" value=""></td>
				</tr>
				
				<tr>
					<td align="right" colspan="2"><input type="submit"	name="operation" value="SignIn">
						 <input type="submit" name="operation" value="SignUp">
						 
						
						</td>
						
				</tr>
         
         </table>
          <%@ include file="Footer.jsp"%>  
         
         </form>
         </center>
</body>
</html>