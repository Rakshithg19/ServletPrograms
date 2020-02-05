import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raksh.app.DAO.CountryDAO;
import com.raksh.app.DAO.CountryDAOimpl;
import com.raksh.app.Entity.CountryEntity;

public class CountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("this is servlet");
		String CountryName = request.getParameter("cname").trim();
		String CountryContinent = request.getParameter("ccon").trim();
		String President = request.getParameter("cpres").trim();
		int NoOfStates = Integer.parseInt(request.getParameter("cnos").trim());
		System.out.println(CountryName);
		
		CountryEntity ce = new CountryEntity();
		ce.setCountryName(CountryName);
		ce.setCountryContinent(CountryContinent);
		ce.setPresident(President);
		ce.setNoOfStates(NoOfStates);
		
		CountryDAO dao = new CountryDAOimpl();
		dao.save(ce);
		System.out.println("saved");
		
		ServletOutputStream outputStream = response.getOutputStream();
		outputStream.print("Thank  you for visiting " + CountryName );
		outputStream.print("continent is :"+ CountryContinent);
		outputStream.print("President  is :"+ President);

	}

	public CountryServlet() {
		System.out.println("Servlet Object is Created");
	}

}
