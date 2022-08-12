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
	
	public void actualizarProfesor(int index, Profesor p) {
		this.listaProfesores.set(index, p);
	}
	
	public int sizeProfesor() {
		return this.listaProfesores.size();
	}
	
	public void removeProfesor(int index) {
		this.listaProfesores.remove(index);
	}
	
	public void addAlumno(Alumno p) {
		this.listaAlumnos.add(p);
	}
	
	public void actualizarAlumno(int index, Alumno p) {
		this.listaAlumnos.set(index, p);
	}
	
	public void getAlumno(int index) {
		this.listaAlumnos.get(index);
	}
	
	public int sizeAlumno() {
		return this.listaAlumnos.size();
	}
	
	public void removeAlumno(int index) {
		this.listaAlumnos.remove(index);
	}
	
	
}
