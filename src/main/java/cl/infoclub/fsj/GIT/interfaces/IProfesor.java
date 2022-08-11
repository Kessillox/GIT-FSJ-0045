package cl.infoclub.fsj.GIT.interfaces;

import cl.infoclub.fsj.GIT.modelo.Profesor;

public interface IProfesor {

	void crear(Profesor profesor);
	
	void listar();
	
	void actualizar(Profesor profesor);
	
	void eliminar(Profesor profesor);
}
