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
             
         <form action="MarksheetCtl" method="post">
         
              <%  String msg = request.getParameter("msg"); %>
           <%@ include file="Header.jsp" %>
           <h1>Marksheet</h1>
         <table>
            
         <tr>
          <%if(msg!=null){%>
        	  
        	 <%=msg %>
        <%} %>  
         </tr>
         
         
         <tr>
         <th>Name</th>
         <td><input type="text" name="name" value=""></td>
         </tr>
         <tr>
         <th>RollNo</th>
         <td><input type="text" name="rollNo" value=""></td>   
         </tr>
         <tr>      
         <th>Physics</th>
         <td><input type="text" name="physics" value=""></td>
         </tr>
         <tr>
         <th>Chemistry</th>
         <td><input type="text" name="chemistry" value=""></td>
         </tr>
         <tr>
         <th>Maths</th>
          <td><input type="text" name="maths" value=""></td>
                   
         
         </tr>
         <tr>
         <th></th>
         <td><input type="submit" name="operation" value="Add">
             <input type="submit" name="operation" value="Update">
             <input type="submit" name="operation" value="Delete">
             
         
         </td>
         
         
         
         
         
         
         </table>
         
         
         
         </form>
         </center>
</body>
</html>