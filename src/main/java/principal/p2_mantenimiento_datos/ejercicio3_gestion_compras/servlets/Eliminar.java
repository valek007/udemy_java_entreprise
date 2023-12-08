package principal.p2_mantenimiento_datos.ejercicio3_gestion_compras.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import principal.p2_mantenimiento_datos.ejercicio3_gestion_compras.beans.Item;

/**
 * Servlet implementation class Eliminar
 */
@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession(); 
		List<Item> carrito = (List<Item>) s.getAttribute("carrito");
		if( carrito!=null) {
			int pos = Integer.parseInt(request.getParameter("pos"));		
			carrito.remove(pos);
		} 
		request.getRequestDispatcher("VerCarrito").forward(request, response);
	}

}
