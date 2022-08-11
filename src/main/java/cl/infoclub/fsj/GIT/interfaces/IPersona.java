package cl.infoclub.fsj.GIT.interfaces;

import cl.infoclub.fsj.GIT.modelo.Persona;

public interface IPersona {

	
	void crear(Persona persona);
	
	void listar();
	
	void actualizar(Persona persona);
	
	void eliminar(Persona persona);
}
