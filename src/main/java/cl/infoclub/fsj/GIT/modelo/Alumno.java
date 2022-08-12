package cl.infoclub.fsj.GIT.modelo;

import java.util.ArrayList;

public class Alumno extends Persona {

	private ArrayList<Double> listaNotas = new ArrayList<>();
	
	private int numeroLista;
	private String curso;
	
	public Alumno( int numeroLista, String curso) {
		super();
		this.numeroLista = numeroLista;
		this.curso = curso;
		
	}
	public Alumno() {
		super();
		
	}
	public int getNumeroLista() {
		return numeroLista;
	}
	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [numeroLista=" + numeroLista + ", curso=" + curso + "]";
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
