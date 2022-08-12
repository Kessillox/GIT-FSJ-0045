package cl.infoclub.fsj.GIT.modelo;

import java.util.ArrayList;

public class Alumno extends Persona {

	private ArrayList<Double> listaNotas = new ArrayList<>();
	
	public Alumno() {
		super();
		
	}
	
	private ArrayList<Double> getListaAlumnos() {
		return this.listaNotas;
	}
	
	@Override
	public String toString() {
		return "Alumno [getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1() + ", getApellido2()="
				+ getApellido2() + ", getEdad()=" + getEdad() + ", getRut()=" + getRut() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
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
