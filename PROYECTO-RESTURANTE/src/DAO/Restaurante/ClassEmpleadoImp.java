package DAO.Restaurante;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectorBD.ConectarMySql;
import Interfaces.Resturante.IntEmpleadoable;
import Modelo.Restaurante.ClassEmpleado;

public class ClassEmpleadoImp implements IntEmpleadoable{

	@Override
	public void RegistrarEmpleado(ClassEmpleado clem) {
		ConectarMySql cnx = new ConectarMySql();
		String sql="insert into tbl_empleado values(null,?,?,?,?,?,?,?)";
		PreparedStatement ps=null;
		try {
			ps=cnx.conexion().prepareStatement(sql);
			ps.setString(1, clem.getNom_emp());
			ps.setString(2, clem.getApe_emp());
			ps.setInt(3, clem.getDni());
			ps.setInt(4, clem.getEdad());
			ps.setDate(5, new java.sql.Date(clem.getFechanac_emp().getTime()));
			ps.setDate(6, new java.sql.Date(clem.getFechaing_emp().getTime()));
			ps.setInt(7, clem.getRol());
			int x=ps.executeUpdate();
			if(x>0){
				System.out.println("Empleado registrado");
			}else{
				System.out.println("Empleado no registrado");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void ActualizarEmpleado(ClassEmpleado clem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarEmpleado(ClassEmpleado clem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ClassEmpleado BuscarEmpleado(ClassEmpleado clem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassEmpleado> ListarEmpleado() {
		
		ConectarMySql cnx = new ConectarMySql();
		String sql ="select * from tbl_empleado";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<ClassEmpleado> listaemp = new ArrayList<ClassEmpleado>();
		try {
			ps=cnx.conexion().prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				ClassEmpleado empalm = new ClassEmpleado();
				empalm.setId_emp(rs.getInt(1));
				empalm.setNom_emp(rs.getString(1));
				empalm.setApe_emp(rs.getString(3));
				empalm.setDni(rs.getInt(4));
				empalm.setEdad(rs.getInt(5));
				empalm.setFechanac_emp(rs.getDate(6));
				empalm.setFechaing_emp(rs.getDate(7));
				empalm.setRol(rs.getInt(8));
				listaemp.add(empalm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaemp;
	}

	@Override
	public List<ClassEmpleado> ListarEmpleadoxRol() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
