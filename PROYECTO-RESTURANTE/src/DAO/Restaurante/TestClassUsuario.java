package DAO.Restaurante;

import Modelo.Restaurante.ClassUsuario;

public class TestClassUsuario {

	public static void main(String[] args) {
		
		ClassUsuario clausu = new ClassUsuario();
		ClassUsuarioimp crud = new ClassUsuarioimp();
		
		//metodo ingresar
		clausu.setNom_usu("admin");
		clausu.setPas_usu("123456");
		
		crud.RegistrarUsuario(clausu);

	}

}
