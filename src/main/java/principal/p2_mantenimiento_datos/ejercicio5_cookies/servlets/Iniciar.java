package principal.p2_mantenimiento_datos.ejercicio5_cookies.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Iniciar")
public class Iniciar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//buscamos la cookie credenciales, si existe es que el
		//usuario ya se autentic� con anterioridad
		Cookie[] cookies=request.getCookies();
		String url="acceso.html";
		if(cookies!=null) {
			for(Cookie ck:cookies) {
				if(ck.getName().equals("credenciales")) {
					String[] datos=ck.getValue().split("[-]");
					url="Autentificar4?user="+datos[0]+"&pwd="+datos[1];
				}
			}
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
