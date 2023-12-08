package principal.p2_mantenimiento_datos.ejercicio3_gestion_compras.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import principal.p2_mantenimiento_datos.ejercicio3_gestion_compras.beans.Item;

/**
 * Servlet implementation class Comprar
 */
@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession();
		List<Item> carrito=(List<Item>)s.getAttribute("carrito");
		if(carrito==null) {
			carrito=new ArrayList<Item>();
			s.setAttribute("carrito", carrito);
		}
		//recuperamos datos del producto, creamos un objeto producto
		//y lo guardamos en el carrito
		String nom = request.getParameter("nombre");
		int can = Integer.parseInt(request.getParameter("unidades"));
		double vlr = Double.parseDouble(request.getParameter("precio"));
					
		carrito.add(new Item(nom, can, vlr));		
		request.getRequestDispatcher("opciones.html").forward(request, response);
	}

}
