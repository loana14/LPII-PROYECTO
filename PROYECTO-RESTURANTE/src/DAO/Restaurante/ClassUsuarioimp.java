package DAO.Restaurante;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ConectorBD.ConectarMySql;
import Interfaces.Resturante.IntUsuarioable;
import Modelo.Restaurante.ClassUsuario;

public class ClassUsuarioimp implements IntUsuarioable{

	@Override
	public void RegistrarUsuario(ClassUsuario clusu) {
		
		ConectarMySql cnx = new ConectarMySql();
		String sql="insert into tbl_usuario values(null,?,?)";
		PreparedStatement ps = null;
		try {
			ps=cnx.conexion().prepareStatement(sql);
			ps.setString(1, clusu.getNom_usu());
			ps.setString(2, clusu.getPas_usu());
			int x = ps.executeUpdate();
			if(x>0){
				System.out.println("Usuario registrado");
			}else{
				System.out.println("Usuario no registrado");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ClassUsuario ValidarUsuario(ClassUsuario clusu) {
		ConectarMySql cnx = new ConectarMySql();
		String sql="select * from tbl_usuario where nom_usu=? and pas_usu=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		ClassUsuario usualm = new ClassUsuario();
		try {
			ps=cnx.conexion().prepareStatement(sql);
			ps.setString(1, clusu.getNom_usu());
			ps.setString(2, clusu.getPas_usu());
			rs=ps.executeQuery();
			if(rs.next()){
				usualm.setId_usu(rs.getInt(1));
				usualm.setNom_usu(rs.getString(2));
				usualm.setPas_usu(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usualm;
	}

}
