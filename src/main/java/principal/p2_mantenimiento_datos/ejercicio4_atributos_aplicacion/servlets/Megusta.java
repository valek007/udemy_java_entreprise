package principal.p2_mantenimiento_datos.ejercicio4_atributos_aplicacion.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Megusta
 */
@WebServlet("/Megusta")
public class Megusta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=request.getServletContext();
		int contador=0;
		if(context.getAttribute("megusta")!=null) {
			contador=(Integer)context.getAttribute("megusta");
		}
		contador++;
		context.setAttribute("megusta", contador);
		request.getRequestDispatcher("me_gusta.html").forward(request, response);
	}

}
