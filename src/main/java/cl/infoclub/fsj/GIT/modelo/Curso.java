package cl.infoclub.fsj.GIT.modelo;

import java.io.IOException;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.repositorios.AlumnoRepo;
import cl.infoclub.fsj.GIT.repositorios.ProfesorRepo;
import cl.infoclub.fsj.GIT.utilidades.EntradaSalida;


public class Curso {
	private ArrayList<Profesor> listaProfesores;
	private ArrayList<Alumno> listaAlumnos;
	
	private AlumnoRepo ar;
	private ProfesorRepo pr;
	
	private EntradaSalida inOut;
	
	public Curso() {
		super();
		listaProfesores = new ArrayList<>();
		listaAlumnos = new ArrayList<>();
		ar = new AlumnoRepo();
		pr = new ProfesorRepo();
		inOut= new EntradaSalida();
	}
	
	
	public ArrayList<Profesor> getListaProfesores(){
		return this.listaProfesores;
	}
	
	public ArrayList<Alumno> getListaAlumnos(){
		return this.listaAlumnos;
	}
	
	
	//Metodos Profesor
	
	public int sizeProfesor() {
		return this.listaProfesores.size();
	}
	
	public void removeProfesor(int index) {
		this.listaProfesores.remove(index);
	}
	public String crearProfesor(Profesor profesor) {
		return pr.crear(profesor, listaProfesores);
	}
	
	public String actualizarProfesor(String rut) throws IOException {
		return pr.actualizar(rut, listaProfesores);
	}
	 
	public String eliminarProfesor(String rut) {
		return pr.eliminar(rut, listaProfesores);
	}
	
	public void listarProfesores() {
		pr.listarProfesores(listaProfesores);
	}
	
	
	//Metodos Alumno
	
	public String crearAlumno(Alumno alumno) {
		return ar.crear(alumno, listaAlumnos);
	}
	
	public String actualizarAlumno(String rut) throws IOException {
		return ar.actualizar(rut, listaAlumnos);
	}
	 
	public String eliminarAlumno(String rut) {
		return ar.eliminar(rut, listaAlumnos);
	}
	
	public String listarAlumnos() {
		return ar.listarAlumnos(listaAlumnos);
		
	}
	
	public double promedioAlumno(String rut) {
		for(Alumno alumno: listaAlumnos) {
			if(alumno.getRut().equals(rut))
				return ar.promedio(alumno.getListaNotas());
		}
		return 0.0;
	}
	
	public String agregarNota(String rut, double nota) {
		for(Alumno alumno: listaAlumnos) {
			if(alumno.getRut().equals(rut)) {
				return ar.agregarNota(alumno.getListaNotas(), nota);

			}
		}
		return "No se ha podido agregar la nota ya que el alumno no existe.";
	}
	
	public void listarNotas(String rut) {
		for(Alumno alumno: listaAlumnos) {
			if(alumno.getRut().equals(rut)) {
				ar.listarNotas(alumno.getListaNotas());
			}
		}
		System.out.println("No se ha encontrado al alumno.");
	}
	
	public double promedioCurso() {
		double sumaNotas = 0.0;
		for(Alumno alumno: listaAlumnos) {	
				sumaNotas=sumaNotas + ar.promedio(alumno.getListaNotas());
		}
		return sumaNotas/listaAlumnos.size();
	}

	
	//Metodos exportacion
	
	
	public void exportarAlumnos() {
		inOut.exportarAlumnos(listaAlumnos);
	}
	
	public void exportarProfesores() {
		inOut.exportarProfesores(listaProfesores);
	}
	
	
	
	//Utilidades
	
	public void getAlumno(int index) {
		this.listaAlumnos.get(index);
	}
	
	public int sizeAlumno() {
		return this.listaAlumnos.size();
	}
	

	public void addProfesor(Profesor p) {
		this.listaProfesores.add(p);
	}
	
	public void getProfesor(int index) {
		this.listaProfesores.get(index);
	}
}
