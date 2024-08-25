package com.novell.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInServlet
 */
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");
	        response.setCharacterEncoding("UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            out.println("<!DOCTYPE html>");
	            out.println("<html lang='en'>");
	            out.println("<head>");
	            out.println("<meta charset='UTF-8'>");
	            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	            out.println("<title>Login</title>");
	            out.println("<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<div class='container mt-5'>");
	            out.println("<div class='row justify-content-center'>");
	            out.println("<div class='col-md-6'>");
	            out.println("<h2 class='text-center'>Login</h2>");
	            out.println("<form action='SimpleLoginServlet' method='post'>");
	            out.println("<div class='form-group'>");
	            out.println("<label for='username'>Username</label>");
	            out.println("<input type='text' class='form-control' id='username' name='username' placeholder='Enter username' required>");
	            out.println("</div>");
	            out.println("<div class='form-group'>");
	            out.println("<label for='password'>Password</label>");
	            out.println("<input type='password' class='form-control' id='password' name='password' placeholder='Enter password' required>");
	            out.println("</div>");
	            out.println("<button type='submit' class='btn btn-primary btn-block'>Login</button>");
	            out.println("</form>");
	            out.println("</div>");
	            out.println("</div>");
	            out.println("</div>");
	            out.println("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
	            out.println("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js'></script>");
	            out.println("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
	            out.println("</body>");
	            out.println("</html>");
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
