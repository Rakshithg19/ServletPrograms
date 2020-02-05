package com.raksh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bp")
	public class BookServlet extends HttpServlet  {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			Book b = new Book();
			b.id = 234;
			b.name = "titanic";
			b.author="rakshith";
			ServletOutputStream so = res.getOutputStream();
			so.print("<html><body bgcolor='blue'>" 
					+"<h1>Thanks for selecting books''"+b.name+" ' ' </h1>"
					+ " <a href ='context.html'>back</a>"
					+ "</body></html>");
		}

	}


