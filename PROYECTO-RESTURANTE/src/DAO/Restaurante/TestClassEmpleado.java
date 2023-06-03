package DAO.Restaurante;

import java.util.Date;
import java.util.List;

import Modelo.Restaurante.ClassEmpleado;

public class TestClassEmpleado {
	
	public static void main(String[] args) {
		
		ClassEmpleado clemp = new ClassEmpleado();
		ClassEmpleadoImp crudem = new ClassEmpleadoImp();
		
		//metodo registrar
		clemp.setNom_emp("Roberto");
		clemp.setApe_emp("Sanchez");
		clemp.setDni(78456612);
		clemp.setEdad(30);
		Date fecha = new Date();
		Date datesql = new Date(fecha.getTime());
		clemp.setFechanac_emp(datesql);
		clemp.setFechaing_emp(datesql);
		clemp.setRol(1);
		
		crudem.RegistrarEmpleado(clemp);
		
		
		//metodo listar
		/*List<ClassEmpleado> listado = crudem.ListarEmpleado();
		for(ClassEmpleado listar:listado){
			System.out.println("id empleado "+ listar.getId_emp());
		}*/
	}
}
