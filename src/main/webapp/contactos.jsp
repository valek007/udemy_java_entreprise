<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="principal.p5_mvc.modelo.AgendaContactos,principal.p5_mvc.beans.Contacto,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta http-equiv="cache-control" content="max-age=0"/>
<meta http-equiv="cache-control" content="no-cache"/>
<meta http-equiv="expires" content="0"/>
<meta http-equiv="pragma" content="no-cache"/>

<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="1">
			<tr><th>Nombre</th><th>Email</th><th>Edad</th><th></th></tr>
			<%List<Contacto> contactos=(List<Contacto>)request.getAttribute("contactos");
			for(Contacto c:contactos){%>
			
				<tr>
					<td><%=c.getNombre() %></td>
					<td><%=c.getEmail() %></td>
					<td><%=c.getEdad() %></td>
					<td><a href="Controller?op=doEliminar&idContacto=<%=c.getIdContacto()%>">Eliminar</a></td>
				</tr>
			<%} %>	
		</table>
		<br/><br/>
		<a href="Controller?op=toInicio">Volver</a>
	</center>
</body>
</html>