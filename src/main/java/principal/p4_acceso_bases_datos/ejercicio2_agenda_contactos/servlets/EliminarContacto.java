package principal.p4_acceso_bases_datos.ejercicio2_agenda_contactos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.p4_acceso_bases_datos.ejercicio2_agenda_contactos.modelo.AgendaContactos;

/**
 * Servlet implementation class EliminarAction
 */
@WebServlet("/EliminarContacto")
public class EliminarContacto extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("idContacto"));
		AgendaContactos gcontactos=new AgendaContactos();
		gcontactos.eliminarContacto(id);
		request.getRequestDispatcher("contactos.jsp").forward(request, response);
	}

}
