package principal.p2_mantenimiento_datos.ejercicio1_atributos.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import principal.p2_mantenimiento_datos.ejercicio1_atributos.beans.Ficha;

@WebServlet("/Autentificar2")
public class Autentificar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
			Ficha ficha = new Ficha(user,33,"prueba@mail.com");
			request.setAttribute("ficha", ficha);
			rd=request.getRequestDispatcher("Bienvenida2");
		}else {
			rd=request.getRequestDispatcher("Error2");
		}
		rd.forward(request, response);
	}

}
