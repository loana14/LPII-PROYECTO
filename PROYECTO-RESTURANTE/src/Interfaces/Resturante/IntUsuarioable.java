package Interfaces.Resturante;

import Modelo.Restaurante.ClassUsuario;

public interface IntUsuarioable {
	
	void RegistrarUsuario(ClassUsuario clusu);
	ClassUsuario ValidarUsuario(ClassUsuario clusu);
	
}
