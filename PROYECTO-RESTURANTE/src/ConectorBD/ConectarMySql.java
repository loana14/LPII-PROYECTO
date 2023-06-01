package ConectorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarMySql {

	String url="jdbc:mysql://localhost:3306/LPRESTAURANTE";
	String usuario="root";
	String password="";
	Connection con;
	
	public Connection conexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usuario, password);
			if(con!=null) System.out.println("Conexión exitosa");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return con;
	}
}
