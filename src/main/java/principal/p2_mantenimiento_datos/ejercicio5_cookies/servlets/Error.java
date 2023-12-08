package principal.p2_mantenimiento_datos.ejercicio5_cookies.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Error4")
public class Error extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); //tipo de formato de respuesta
		PrintWriter out=response.getWriter(); //construimos p�gina de respuesta
		out.println("<html><body>");
		out.println("<h1>Error el usuario "+request.getParameter("user")+" con contraseña");
		out.println(request.getParameter("pwd")+" no est&aacute; registrado</h1>");
		out.println("<br/>");
		out.println("<a href='acceso.html'>volver</a>");
		out.println("</body></html>");
	}
}
