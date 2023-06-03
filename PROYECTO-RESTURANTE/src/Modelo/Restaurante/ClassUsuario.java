package Modelo.Restaurante;

public class ClassUsuario {
	
	private int id_usu;
	private String nom_usu;
	private String pas_usu;
		
	
	public ClassUsuario() {
	}

	public ClassUsuario(int id_usu, String nom_usu, String pas_usu) {
		this.id_usu = id_usu;
		this.nom_usu = nom_usu;
		this.pas_usu = pas_usu;
	}

	public int getId_usu() {
		return id_usu;
	}

	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}

	public String getNom_usu() {
		return nom_usu;
	}

	public void setNom_usu(String nom_usu) {
		this.nom_usu = nom_usu;
	}

	public String getPas_usu() {
		return pas_usu;
	}

	public void setPas_usu(String pas_usu) {
		this.pas_usu = pas_usu;
	}
	
	
}
