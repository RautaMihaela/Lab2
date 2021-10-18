

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/SetCookie")
public class GetCookie extends HttpServlet {
        private static final long serialVersionUID = 1L;
	private static int count = 0;  
   
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
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
		}
		
		count++;
		Cookie counterCookie = new Cookie("Counter", String.valueOf(count));
		
		counterCookie.setComment("SetCookie Counter");
		
		counterCookie.setMaxAge(24*24*365);
		
		counterCookie.setPath("/ServletCookie/cookie/SetCookie");

		
		response.addCookie(counterCookie);
		
		
		Cookie domainCookie = new Cookie("Test", "Test Cookie"+String.valueOf(count));
		domainCookie.setComment("Test Cookie");
		response.addCookie(domainCookie);
		
		out.write("</body></html>");
	}

}
