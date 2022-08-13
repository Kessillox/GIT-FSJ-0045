package cl.infoclub.fsj.GIT.interfaces;

import java.io.IOException;

import cl.infoclub.fsj.GIT.modelo.Profesor;

public interface IProfesor {

	void crearProfesor(Profesor profesor);
	
	void listarProfesor();
	
	boolean actualizarProfesor(String rut)throws IOException ;
	
	String eliminarProfesor(String rut);
}
