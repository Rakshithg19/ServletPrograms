package com.raksh;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ep")
public class ElectronicServlet extends HttpServlet  {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Product pro = new Product();
		pro.id=1234;
		pro.name="ear phone";
		pro.price=344.3;
		pro.brand="apple";
		
		ServletContext con = getServletContext();
		String val1=con.getInitParameter("key1");
		String val2 = con.getInitParameter("key2");
		ServletOutputStream so = res.getOutputStream();
		so.print("<html><body bgcolor='blue'>"+
		"<h1>' "+val1 +"'   '"+val2 +"' </h1>"
				+"<h2>Thanks for selecting electronics''"+pro.name+" ' ' </h2>"
				+ " <a href ='context.html'>back</a>"
				+ "</body></html>");
	}

}
