package cl.infoclub.fsj.GIT.modelo;

import java.util.ArrayList;

public class Alumno extends Persona {

	private ArrayList<Double> listaNotas = new ArrayList<>();
	
	public Alumno() {
		super();
	}
	
	public ArrayList<Double> getListaNotas(){
		return this.listaNotas;
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
