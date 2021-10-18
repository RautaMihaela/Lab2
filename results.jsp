<%-- 
    Document   : results
    Created on : Oct 16, 2021, 6:15:00 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Information</title>
    </head>
    <%
        String firstandlastName = request.getParameter("first");
        String age = request.getParameter("age");
        String city = request.getParameter("city");
        String gender = request.getParameter("gender");
         %>
    <body>
    <h1>User Information</h1>
    
    <table border="|">
        <tbody>
            <tr>
                <td>First and Last Name</td>
                <td><%= firstandlastName %></td>
            </tr>  
            <tr>
                <td>Age</td>
                <td><%= age %></td>
            </tr> 
            <tr>
                <td>City</td>
                <td><%= city %></td>
            </tr> 
            <tr>
                <td>Gender</td>
                <td><%= gender %></td>
            </tr> 
        </tbody>
        
        
    </table>
        
        
        
        
    </body>
</html>
