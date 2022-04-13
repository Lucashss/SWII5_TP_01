package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Creditos")
public class Creditos extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>IFSP - CBT</h1>");
		out.println("<h2>SISTEMAS WEB I</h2>");
		out.println("<h1>Alunos:</h1>");
		out.println("<br/>");
		out.println("<h2>Lucas Henrique de Souza Santos CB3012212</h2>");
		out.println("<h2>Nikolas Caldeira e Silva CB3012247</h2>");
		out.println();
		out.println("<a href='index.html'>Inicio</a>");
		out.close();
	}
}
