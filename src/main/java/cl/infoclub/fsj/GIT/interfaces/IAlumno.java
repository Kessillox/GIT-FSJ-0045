package cl.infoclub.fsj.GIT.interfaces;

import cl.infoclub.fsj.GIT.modelo.Alumno;

public interface IAlumno {

	void crear(Alumno alumno);
	
	void listar();
	
	void actualizar(Alumno alumno);
	
	void eliminar(Alumno alumno);
}
