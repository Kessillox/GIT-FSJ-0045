package cl.infoclub.fsj.GIT.modelo;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Profesor> listaProfesores = new ArrayList<>();
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
	
	
	
	public Curso() {
		super();
	}

	public void addProfesor(Profesor p) {
		this.listaProfesores.add(p);
	}
	
	public void getProfesor(int index) {
		this.listaProfesores.get(index);
	}
	
	public int sizeProfesor() {
		return this.listaProfesores.size();
	}
	
	public void removeProfesor(Profesor p) {
		this.listaProfesores.remove(p);
	}
}
