package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GenerateTruthOrDare;

/**
 * Servlet implementation class getDareServlet
 */
@WebServlet("/getDareServlet")
public class getDareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GenerateTruthOrDare generateDare = new GenerateTruthOrDare();
		request.setAttribute("dareResult", generateDare);
		
		getServletContext().getRequestDispatcher("/dareresults.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		
		writer.println(generateDare.generateTruth());
		writer.close();
	}

}
