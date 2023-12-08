package principal.p5_mvc.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import principal.p5_mvc.beans.Contacto;

public class AgendaContactos {
	private String url="jdbc:mysql://localhost:3307/agenda";
	String user="root";
	String pwd="root";
	static{
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}        
    }
	public void agregar(Contacto con){
        try(Connection cn=DriverManager.getConnection(url,user,pwd);) {                                   
            String sql="Insert into contactos (nombre,email,edad) ";
            sql+="values(?,?,?)";
            //creamos consulta preparada:
            PreparedStatement ps=cn.prepareStatement(sql);
               //Sustituimos parametros por valores
               ps.setString(1, con.getNombre());
               ps.setString(2, con.getEmail());
               ps.setInt(3, con.getEdad());
               //ejecutamos
               ps.execute();            
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }      
    }
	public void eliminarContacto(int id) {
    	try(Connection cn=DriverManager.getConnection(url,user,pwd);) {                       
            String sql="Delete from contactos where idContacto=?";           
            //creamos consulta preparada:
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }     
    }
	public List<Contacto> recuperarContactos(){        
        List<Contacto> lista=new ArrayList<>();           
        try(Connection cn=DriverManager.getConnection(url,user,pwd);) {                                   
            String sql="select * from contactos";
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                lista.add(new Contacto(rs.getInt("idContacto"),rs.getString("nombre"),rs.getString("email"),rs.getInt("edad")));
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }   
        return lista;
    }
}
