package principal.p5_mvc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.p5_mvc.modelo.AgendaContactos;

/**
 * Servlet implementation class ListadoAction
 */
@WebServlet("/ListadoAction")
public class ListadoAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AgendaContactos gcontactos=new AgendaContactos();
		request.setAttribute("contactos", gcontactos.recuperarContactos());
	}

}
