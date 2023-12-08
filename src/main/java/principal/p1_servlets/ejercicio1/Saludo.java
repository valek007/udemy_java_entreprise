package principal.p1_servlets.ejercicio1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Saludo")
public class Saludo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><center>");
		for (int i = 0; i <= 6; i++) {
			out.println("<h"+i+">Bienvenido a mi servlet</h"+i+">");
		}
		out.println("</center></body></html>");
}
}
