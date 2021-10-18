

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener()
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext() .log("MyListener:contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext() .log("MyListener:contextDestroyed");
    }
}