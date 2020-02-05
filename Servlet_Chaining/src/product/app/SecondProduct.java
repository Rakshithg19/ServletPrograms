package product.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondProduct")
public class SecondProduct extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String product = req.getParameter("pr");
		String quantity = req.getParameter("qt");
		int quanity =Integer.parseInt(quantity);
		double price = 12000.00;
		double total = quanity*price;
		
		ServletOutputStream os = resp.getOutputStream();
		os.print("total amount is"+total);
}
}
