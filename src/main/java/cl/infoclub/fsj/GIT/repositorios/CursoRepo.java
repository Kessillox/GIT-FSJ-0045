package cl.infoclub.fsj.GIT.repositorios;

import java.util.ArrayList;

import cl.infoclub.fsj.GIT.interfaces.IAlumno;
import cl.infoclub.fsj.GIT.interfaces.IProfesor;
import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Profesor;

public class CursoRepo implements IAlumno, IProfesor{

ArrayList<Alumno> alumnosLista = new ArrayList<Alumno>();
	
	
	public ArrayList<Alumno> getAlumno() {
		return alumnosLista;
	}
	
	public void setAlumno(ArrayList<Alumno> alumno) {
		this.alumnosLista = alumno;
	}

	public void crearAlumno (Alumno al) {
		this.alumnosLista.add(al);
		
	}
	
	public void listarAlumno() {
		for (int i= 0;i<alumnosLista.size();i++) {
				System.out.println(getAlumno().get(i));
			
		}
	}
	
	public void actualizarAlumno(String rut) {

		
	}
	public String eliminarAlumno(String rut) {
		//System.out.println("ingrese el rut a eliminar");
		
		for (Alumno auxAlumno: alumnosLista) {
				if (rut.equals(auxAlumno.getRut())) {
					alumnosLista.remove(auxAlumno);
					return "Alumno Eliminado con exito";
				}
		}
		return "No se elimino al Alumno por no encontrarse en la lista";
		
	}
	///************PROFESOR***********//////
	ArrayList<Profesor> profesor = new ArrayList<Profesor>();
	
	
	public ArrayList<Profesor> getProfesor() {
		return profesor;
	}

	public void setProfesor(ArrayList<Profesor> profesor) {
		this.profesor = profesor;
	}


	public void crearProfesor(Profesor pr) {
		this.profesor.add(pr);
		
	}
	
	public void listarProfesor() {
		for (int i= 0;i<profesor.size();i++) {
				System.out.println(getProfesor().get(i));
			
		}
	}
	
	public void actualizarProfesor(Profesor profesor) {

		
	}
	public void eliminarProfesor(Profesor profesor) {
	}
}
