package org.raksh.info;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("Service method is executed");
		
		String Name = req.getParameter("nm");
		String Age = req.getParameter("ag");
		String Height = req.getParameter("hg");
		String Weight = req.getParameter("wg");
		ServletOutputStream so = resp.getOutputStream();
		so.print("details are"+Name+" "+Age+" "+Height+" "+Weight);
	}
}
