<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h1>welcome to first page</h1> 
        
           <% String firstName= request.getParameter("firstName");
           String lastName= request.getParameter("firstName");
          // String lasstName= request.getParameter("lastName");
           String loginId= request.getParameter("loginId");
           String password= request.getParameter("password");
           String address= request.getParameter("address");
           %>
          <h2> <%=firstName %> </h2>
          <h2> <%=lastName %> </h2>
          <h2> <%=loginId %> </h2>
          <h2> <%=password %> </h2>
          <h2> <%=address %> </h2>
           
</body>
</html>