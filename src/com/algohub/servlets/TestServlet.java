package com.algohub.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.lang.String;
import java.lang.StringBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(description = "First Servlet", urlPatterns = {"/TestServlet","/TestServer.do"})
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String HTML_START = "<html><body>";
	private static final String HTML_END = "</body></html>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter responseWriter = response.getWriter();
		Date date = new Date();
		StringBuilder builder = new StringBuilder();
		builder.append(HTML_START);
		builder.append("<h2>Hello</h2> <br/>");
		builder.append("<h3>Current Date and Time is: " + date.toString() + "</h3>");
		builder.append(HTML_END);
		responseWriter.println(builder.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
