package cl.infoclub.fsj.GIT.modelo;

import java.util.ArrayList;

public class Alumno extends Persona {

	private ArrayList<Double> listaNotas = new ArrayList<>();
	
	
	
	public Alumno() {
		super();
		
	}

	public Alumno(String nombre, String apellido1, String apellido2, int edad, String rut, ArrayList<Double> listaNotas) {
		super(nombre, apellido1, apellido2, edad, rut);
		this.listaNotas = listaNotas;
	}
	public Alumno(String nombre, String apellido1, String apellido2, int edad, String rut) {
		super(nombre, apellido1, apellido2, edad, rut);
	}
	
	
	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}


	public String alumnoToString() {
		return "Alumno:\n1.- Nombre: " + getNombre() + "\n2.- Primer Apellido: " + getApellido1() + "\n3.- Segundo Apellido: "
				+ getApellido2() + "\n4.- Edad: " + getEdad() + "\n5.- Rut: " + getRut();
	}

	

	public void addNota(double notaAdd) {
		this.listaNotas.add(notaAdd);
	}
	
	public void actualizarNota(int index, double notaUpdate) {
		this.listaNotas.set(index, notaUpdate);
	}
	
	public void getNota(int posNota) {
		this.listaNotas.get(posNota);
	}
	
	public int getSizeNotas () {
		return this.listaNotas.size();
	}
}
