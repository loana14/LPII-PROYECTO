package Modelo.Restaurante;

import java.util.Date;

public class ClassEmpleado {
	private int id_emp;
	private String nom_emp;
	private String ape_emp;
	private int dni;
	private int edad;
	private Date fechanac_emp;
	private Date fechaing_emp;
	private int rol;
	private String nom_rol;
	
	
	
	public ClassEmpleado() {
	}

	public ClassEmpleado(int id_emp, String nom_emp, String ape_emp, int dni, int edad, Date fechanac_emp,
			Date fechaing_emp, int rol) {
		this.id_emp = id_emp;
		this.nom_emp = nom_emp;
		this.ape_emp = ape_emp;
		this.dni = dni;
		this.edad = edad;
		this.fechanac_emp = fechanac_emp;
		this.fechaing_emp = fechaing_emp;
		this.rol = rol;
	}

	public int getId_emp() {
		return id_emp;
	}

	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}

	public String getNom_emp() {
		return nom_emp;
	}

	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}

	public String getApe_emp() {
		return ape_emp;
	}

	public void setApe_emp(String ape_emp) {
		this.ape_emp = ape_emp;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechanac_emp() {
		return fechanac_emp;
	}

	public void setFechanac_emp(Date fechanac_emp) {
		this.fechanac_emp = fechanac_emp;
	}

	public Date getFechaing_emp() {
		return fechaing_emp;
	}

	public void setFechaing_emp(Date fechaing_emp) {
		this.fechaing_emp = fechaing_emp;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	public String getNom_rol() {
		return nom_rol;
	}

	public void setNom_rol(String nom_rol) {
		this.nom_rol = nom_rol;
	}
	
	
	
	
}
