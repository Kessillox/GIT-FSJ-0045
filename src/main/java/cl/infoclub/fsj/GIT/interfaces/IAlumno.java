package cl.infoclub.fsj.GIT.interfaces;

import cl.infoclub.fsj.GIT.modelo.Alumno;

public interface IAlumno {

	void crear(Alumno alumno);
	
	void listarAlumnos();
	
	void actualizar(Alumno alumno);
	
	void eliminar(Alumno alumno);
}
