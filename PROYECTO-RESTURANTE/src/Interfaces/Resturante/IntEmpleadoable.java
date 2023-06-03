package Interfaces.Resturante;

import java.util.List;

import Modelo.Restaurante.ClassEmpleado;

public interface IntEmpleadoable {
	
	void RegistrarEmpleado(ClassEmpleado clem);
	void ActualizarEmpleado(ClassEmpleado clem);
	void EliminarEmpleado(ClassEmpleado clem);
	ClassEmpleado BuscarEmpleado(ClassEmpleado clem);
	List<ClassEmpleado> ListarEmpleado();
	List<ClassEmpleado>ListarEmpleadoxRol();
}
