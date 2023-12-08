package principal.p2_mantenimiento_datos.ejercicio2_sessiones.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import principal.p2_mantenimiento_datos.ejercicio1_atributos.beans.Ficha;

/**
 * Servlet implementation class Bienvenida
 */
@WebServlet("/Bienvenida3")
public class Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); //tipo de formato de respuesta
		PrintWriter out=response.getWriter(); //construimos p�gina de respuesta
		out.println("<html><body>");
		
		//recuperamos la ficha de usuario almacenada en sesi�n
		HttpSession s=request.getSession();
		Ficha ficha = (Ficha) s.getAttribute("ficha");
		out.println("<h1>Bienvenido "+ficha.getUsuario()+" a mi p&aacute;gina</h1>");
		out.println("<h1>Tienes "+ficha.getEdad()+" a&ntilde;os</h1>");
		out.println("<h1>Tu email es "+ficha.getEmail()+" </h1>");
		out.println("<br/>");
		//Sessiones 2
		out.println("<h1>Has elegido la opci&oacute;n "+request.getParameter("opcion")+"</h1>");
		out.println("<br/>");
		//---------------------------
		out.println("<a href='acceso.html'>volver</a>");
		out.println("</body></html>");
		
	}

}
