package org.dev.devapp;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/*@WebServlet(urlPatterns = "/lifeCycle", loadOnStartup =688 ,initParams =
{
		@WebInitParam(name="jingalala",value = "ulala")
		})*/
public class LifeCycleServlet extends GenericServlet{
	
	/*
	 * @Override public void init(ServletConfig config) throws ServletException {
	 * 
	 * System.out.println("Initializing the resources of LifeCycleServlet"); }
	 */
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		ServletConfig cong= getServletConfig();
	String value=	cong.getInitParameter("name");
	String age=	cong.getInitParameter("age");
		
		System.out.println("Service method is executed");
	String appName=	req.getParameter("appName");
	String appSize=	req.getParameter("appSize");
	String appVersion=	req.getParameter("version");
	
	ServletOutputStream outputStream = res.getOutputStream();
	outputStream.print("Thank  you for visiting " + appName + "  " + value + " "+ age) ;
	}
	public LifeCycleServlet() {
		System.out.println("Servlet Object is Created");
	}
	

	@Override
	public void destroy() {
		
		System.out.println("Close only  the Costly Resources");
	}

}
