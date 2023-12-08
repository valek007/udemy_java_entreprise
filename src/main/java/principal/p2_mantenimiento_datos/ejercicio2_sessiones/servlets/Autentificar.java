package principal.p2_mantenimiento_datos.ejercicio2_sessiones.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import principal.p2_mantenimiento_datos.ejercicio1_atributos.beans.Ficha;

@WebServlet("/Autentificar3")
public class Autentificar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {

			Ficha ficha = new Ficha(user,33,"prueba@mail.com");
			//obtenemos el objeto HttpSession y guardamos
			//en �l la ficha de usuario
			HttpSession s=request.getSession();
			s.setAttribute("ficha", ficha);
			rd=request.getRequestDispatcher("menu.html");
		}else {
			rd=request.getRequestDispatcher("Error4");
		}
		rd.forward(request, response);
	}

}
