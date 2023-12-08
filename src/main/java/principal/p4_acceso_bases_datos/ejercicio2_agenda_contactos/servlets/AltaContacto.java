package principal.p4_acceso_bases_datos.ejercicio2_agenda_contactos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.p4_acceso_bases_datos.ejercicio2_agenda_contactos.beans.Contacto;
import principal.p4_acceso_bases_datos.ejercicio2_agenda_contactos.modelo.AgendaContactos;

/**
 * Servlet implementation class AltaContacto
 */
@WebServlet("/AltaContacto")
public class AltaContacto extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AgendaContactos gcontactos=new AgendaContactos();
		Contacto contacto=(Contacto)request.getAttribute("contacto");
		gcontactos.agregar(contacto);
		request.getRequestDispatcher("inicio.html").forward(request, response);
	}

}
