package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.dao.CustomerDao;
import study.entity.CustomerEntity;


@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String address = request.getParameter("address");
		
		CustomerEntity cust =new CustomerEntity(id, firstName, lastName, address);
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
			pw.append("<p>Data Inserted</p>");
			response.sendRedirect("success.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
