package com.novell.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("System is fired up");
		System.out.println("Welcome to Novell internal service application");
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">");
		out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\"></script>");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("<h1 class=\"text-center\">Welcome to Bootstrap with JSP</h1>");
		out.println(" <p class=\"lead\">This is a simple example of integrating Bootstrap with JSP.</p>");
		out.println("  </div>");
		out.println("<form action='ProcessLoginServlet' method='POST'>");
		out.println("<h1>Novell Services Login</h1>");
		//username field
		out.println("<label for='username'>Username</label>");
		out.println("<input type='text' id='username' name='username'><br><br>");
		
		//password field
		out.println("<label for='password'>Password</label>");
		out.println("<input type='password' id='password' name='password'><br><br>");
		out.println("</body>");
		out.println("</html>");
		
		//cityofemployment field
		out.println("<label for='cityofemployment'>City of Employment</label>");
		out.println("<input type='text' id='cityofemployment' name='cityofemployment'><br><br>");
		out.println("</body>");
		out.println("</html>");
		
	
		//combobox (dropdown) for server
		out.println("<label for='server'>Server</label>");
		out.println("<select id='role' name='role'>");
		out.println("<option value='webserver'>Web Server</option>");
		out.println("<option value='dataserver'>Database Server</option>");
		out.println("<option value='fileserver'>File Server</option>");
		out.println("<option value='networkserver'>Network Server</option>");
		out.println("</select><br><br>");
		
		out.println("<label for='role'>Please specify your roles</label><br>");
		//radiobutton for role
		out.println("<input type='radio' id='admin' name='role' value='admin'>Admin<br>");
		out.println("<input type='radio' id='engineer' name='role' value='engineer'>Engineer<br>");
		out.println("<input type='radio' id='manager' name='role' value='manager'>Manager<br>");
		out.println("<input type='radio' id='guest' name='role' value='guest'>Guest<br>");
		

		out.println("<label >Single Sign on to the following</label>");
		//checkbox for services
		out.println("<input type='checkbox' id='mail' name='services' value='Mail' />");
				out.println("<label for='mail'>Mail</label>");
		out.println("<input type='checkbox' id='payroll' name='services' value='Payroll' />");
				out.println("<label for='payroll'>Payroll</label>");
				out.println("<input type='checkbox' id='selfservice' name='services' value='Self-Service' />");
				out.println("<label for='selfservice'>Self-Service</label><br><br>");
				
		
		out.println("<input type='submit' value='login'  ><br><br>");
		out.println("<input type='submit' value='reset'><br><br>");
		out.println("</form>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
