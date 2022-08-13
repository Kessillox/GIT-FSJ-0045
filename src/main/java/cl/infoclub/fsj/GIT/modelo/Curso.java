package cl.infoclub.fsj.GIT.modelo;

import java.io.IOException;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.repositorios.AlumnoRepo;
import cl.infoclub.fsj.GIT.repositorios.ProfesorRepo;


public class Curso {
	private ArrayList<Profesor> listaProfesores = new ArrayList<>();
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
	
	private AlumnoRepo ar = new AlumnoRepo();
	private ProfesorRepo pr = new ProfesorRepo();
	
	public Curso() {
		super();
	}
	
	private ArrayList<Profesor> getListaProfesores(){
		return this.listaProfesores;
	}
	
	private ArrayList<Alumno> getListaAlumnos(){
		return this.listaAlumnos;
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
	
	
	//
	
	public String crearAlumno(Alumno alumno) {
		return ar.crear(alumno, listaAlumnos);
	}
	
	public String actualizarAlumno(String rut) throws IOException {
		return ar.actualizarAlumno(rut, listaAlumnos);
	}
	 
	public String eliminarAlumno(String rut) {
		return ar.eliminarAlumno(rut, listaAlumnos);
	}
	
	public double promedioAlumno(String rut) {
		for(Alumno alumno: listaAlumnos) {
			if(alumno.getRut().equals(rut))
				return ar.promedio(alumno.getListaNotas());
		}
		return 0.0;
	}
	
	
	
	
	public void getAlumno(int index) {
		this.listaAlumnos.get(index);
	}
	
	public int sizeAlumno() {
		return this.listaAlumnos.size();
	}
	

}
