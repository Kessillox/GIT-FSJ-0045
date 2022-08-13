package cl.infoclub.fsj.GIT.modelo;

import java.util.ArrayList;

public class Alumno extends Persona {

	private ArrayList<Double> listaNotas = new ArrayList<>();
	
	public Alumno() {
		super();
		
	}
	
	public ArrayList<Double> getListaAlumnos() {
		return this.listaNotas;
	}


	public String AlumnoToString() {
		return "Alumno:\n1.- Nombre =" + getNombre() + "\n2.- Apellido1=" + getApellido1() + "\n3.- Apellido2="
				+ getApellido2() + "\n4.- Edad()=" + getEdad() + "\n5.- Rut()=" + getRut();
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
