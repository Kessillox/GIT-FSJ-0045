package cl.infoclub.fsj.GIT.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.modelo.Alumno;

public interface IAlumno {

	String crear (Alumno al,ArrayList<Alumno> alumnos);
	
	String eliminarAlumno(String rut, ArrayList<Alumno> alumnos);
	
	String actualizarAlumno(String rut, ArrayList<Alumno> alumnos) throws IOException ;
	
}
