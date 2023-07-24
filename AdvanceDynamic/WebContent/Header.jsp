<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <table width="100%" border="0">
        <tr>
            
            
           
                                     <img  src="images/rays.jpg" align="right">
               
           
        </tr>
        <tr>
                  <%
		            UserBean bean1 = (UserBean) request.getAttribute("bean");
	               %>
	<%
		if (bean1 != null) {
	%>
	<h3 align="left">
		Hii,
		<%=bean1.getFirstName()%>
		 <h3 align="left"><a href="UserListCtl">UserList</a></h3>
		 <h3 align="left"><a href="MarksheetListCtl">MarksheetList</a></h3>
	</h3>
	     
	<%
		} else {
	%>
	<h3 align="left">Hi, Guest</h3>
	<%
		}
	%>
	   </tr>    
    </table>
    <hr>
</body>
</html>