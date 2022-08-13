package cl.infoclub.fsj.GIT.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.modelo.Alumno;

public interface IAlumno {

	String crear (Alumno al,ArrayList<Alumno> alumnos);
	
	String eliminar(String rut, ArrayList<Alumno> alumnos);
	
	String actualizar(String rut, ArrayList<Alumno> alumnos) throws IOException ;
	
	void listarAlumnos(ArrayList<Alumno> alumnos);

	double promedio(ArrayList<Double> notas );
	
}
