package cl.infoclub.fsj.GIT.repositorios;

import java.util.ArrayList;

import cl.infoclub.fsj.GIT.interfaces.IAlumno;
import cl.infoclub.fsj.GIT.modelo.Alumno;

public abstract class AlumnoRepo implements IAlumno {

ArrayList<Alumno> Alumno = new ArrayList<Alumno>();
	
	
	public ArrayList<Alumno> getAlumno() {
		return Alumno;
	}
	
	public void setAlumno(ArrayList<Alumno> alumno) {
		this.Alumno = alumno;
	}

	public void crear (Alumno al) {
		this.Alumno.add(al);
		
	}
	
	public void listar() {
		for (int i= 0;i<Alumno.size();i++) {
				System.out.println(getAlumno().get(i));
			
		}
	}
	
	public void actualizar (Alumno alumno) {

		
	}
	public void eliminar(Alumno alumno) {
	}

}