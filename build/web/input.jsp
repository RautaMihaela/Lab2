

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Web Application</h1>
        <form name="myForm" action="results.jsp" method="post">
            
            <table>
                
                <tbody>
                    
                    <tr>
                        <td>\First and Last Name</td>
                        <td><input type="text" name="first" value="" size="40" /></td>
                    </tr>
                    
                    <tr>
                        <td>Age</td>
                        <td><input type="text" name="age" value="" size="40" /></td>
                    </tr>
                    
                    <tr>
                        <td>City</td>
                        <td><input type="text" name="city" value="" size="40" /></td>
                    </tr>
                    
                    <tr>
                        <td>Gender</td>
                        <td>
                            <input type="radio" value="gender" name="Female" />Female
                            <input type="radio" value="gender" name="Male" />Male
                            <input type="radio" value="gender" name="Other" />Other
                        </td>
                    </tr>  
                    </tbody>
                
            </table>
            
            <input type="reset" value="Clear" name="clear" />
          <input type="submit" value="Submit" name="submit" /> 
          
        </form>
        
    </body>
</html>
