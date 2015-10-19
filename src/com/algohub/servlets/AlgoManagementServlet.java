package com.algohub.servlets;

import com.algohub.core.*;
import com.algohub.shared.AlgosEnum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlgoManagementServlet
 */
@WebServlet("/AlgoManagementServlet")
public class AlgoManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String HTML_START = "<html><body>";
	private static final String HTML_END = "</body></html>";
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlgoManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
  
 /*
    interface Controller {
    	void process(HttpServletRequest request, HttpServletResponse response);
    }
    
    class Algo1 implements Controller {
    	
    }
    
    class Algo2 implements Controller {
    	
    }
    
    private Map<String, Controller> controllers = new HashMap<String, Controller>() {{
    	put("/algo1", new Algo1());
    	put("/algo2", new Algo2());
    }};
    
    public void service(HttpServletRequest request, HttpServletResponse response) {
    	String url = request.getRequestURI();
    	
    	if (url != null) {
    		
    	}
    	
    	Controller controller = controllers.get(url);
    	
    	if (controller == null) {
    		controller = controllers.get("my default");
    	}
    	
    	controller.process(request, response);
    	
    }
*/
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter responseWriter = response.getWriter();
		Date date = new Date();
		StringBuilder builder = new StringBuilder();
		builder.append(HTML_START);
		builder.append("<h2>Hello</h2> <br/>");
		builder.append("<h3>Current Date and Time is: " + date.toString() + "</h3>");
		builder.append("<br/>IN GET<br/>");
		builder.append(HTML_END);
		responseWriter.println(builder.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("Algorithms") == null)
			response.getWriter().println("No algorithm was selected.");

		String selectedAlgo = request.getParameter("Algorithms");
		switch (selectedAlgo){
			case "Anagrams Test":
				response.getWriter().println(AlgoManager.getManager().processAlgo(AlgosEnum.AnagramsTest));
				break;
			case "Substring Test":
				response.getWriter().println(AlgoManager.getManager().processAlgo(AlgosEnum.SubstringTest));
				break;
			case "Alternating Ints Test":
				response.getWriter().println(AlgoManager.getManager().processAlgo(AlgosEnum.AlternatingIntsTest));
				break;
		}
	}

}
