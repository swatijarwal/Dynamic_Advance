<%@page import="in.co.rays.bean.MarksheetBean"%>
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
            <% String msg =(String)request.getAttribute("msg"); %>>
              <% MarksheetBean bean =  (MarksheetBean)request.getAttribute("bean");   %>
            
         <form action="MarksheetCtl" method="post">
              
           <%@ include file="Header.jsp" %>
         <table>
         <tr>
         <td><input type="hidden" name="id" value="<%=bean.getId()%>"></td>
         
         </tr>
         
         
         <tr>
         <th>Name</th>
         <td><input type="text" name="name" value="<%=bean.getName()%>"></td>
         </tr>
         <tr>
         <th>RollNo</th>
         <td><input type="text" name="rollNo" value="<%=bean.getRollNo()%>"></td>   
         </tr>
         <tr>      
         <th>Physics</th>
         <td><input type="text" name="physics" value="<%=bean.getPhysics()%>"></td>
         </tr>
         <tr>
         <th>Chemistry</th>
         <td><input type="text" name="chemistry" value="<%=bean.getChemistry()%>"></td>
         </tr>
         <tr>
         <th>Maths</th>
          <td><input type="text" name="maths" value="<%=bean.getMaths()%>"></td>
                   
         
         </tr>
         <tr>
         <th></th>
         <td><input type="submit" name="operation" value="add">
               <input type="submit" name="operation" value="Update">
               <input type="submit" name="operation" value="Delete">
             
         
         </td>
         
         
         
         
         
         
         </table>
         
         
         
         </form>
         </center>
</body>
</html>