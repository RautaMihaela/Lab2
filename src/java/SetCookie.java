
import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/GetCookie")
public class SetCookie extends HttpServlet {
         private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            out.write("<html><head></head><body>");
		out.write("<h3>Hello Browser!!</h3>");
             Object requestCookies = null;
		if(requestCookies != null){
		out.write("<h3>Request Cookies:</h3>");
		for(Cookie c : requestCookies){
			out.write("Name="+c.getName()+", "
                                + "Value="+c.getValue()+", Comment="+c.getComment()
					+", Domain="+c.getDomain()+", MaxAge="+c.getMaxAge()+", "
                                                + "Path="+c.getPath()
					+", Version="+c.getVersion());
			out.write("<br>");
			
}  
    

   


