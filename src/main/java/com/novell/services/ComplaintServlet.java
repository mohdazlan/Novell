package com.novell.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComplaintServlet
 */
public class ComplaintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplaintServlet() {
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
            out.println("<title>Customer Complaint Form</title>");
            out.println("<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container mt-5'>");
            out.println("<div class='row justify-content-center'>");
            out.println("<div class='col-md-8'>");
            out.println("<h2 class='text-center'>Customer Complaint Form</h2>");
            out.println("<form action='ComplaintServlet' method='post'>");
            out.println("<div class='form-group'>");
            out.println("<label for='name'>Name</label>");
            out.println("<input type='text' class='form-control' id='name' name='name' placeholder='Enter your name' required>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='email'>Email address</label>");
            out.println("<input type='email' class='form-control' id='email' name='email' placeholder='Enter your email' required>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='phone'>Phone Number</label>");
            out.println("<input type='tel' class='form-control' id='phone' name='phone' placeholder='Enter your phone number'>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='product'>Product</label>");
            out.println("<select class='form-control' id='product' name='product'>");
            out.println("<option>Product A</option>");
            out.println("<option>Product B</option>");
            out.println("<option>Product C</option>");
            out.println("</select>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='issue'>Issue</label>");
            out.println("<textarea class='form-control' id='issue' name='issue' rows='4' placeholder='Describe your issue'></textarea>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='priority'>Priority</label>");
            out.println("<select class='form-control' id='priority' name='priority'>");
            out.println("<option>Low</option>");
            out.println("<option>Medium</option>");
            out.println("<option>High</option>");
            out.println("</select>");
            out.println("</div>");
            out.println("<div class='form-group form-check'>");
            out.println("<input type='checkbox' class='form-check-input' id='subscribe' name='subscribe'>");
            out.println("<label class='form-check-label' for='subscribe'>Subscribe to our newsletter</label>");
            out.println("</div>");
            out.println("<button type='submit' class='btn btn-primary btn-block'>Submit Complaint</button>");
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
