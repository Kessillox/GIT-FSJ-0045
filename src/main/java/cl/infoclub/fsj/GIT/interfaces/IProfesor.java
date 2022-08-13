package cl.infoclub.fsj.GIT.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.modelo.Profesor;

public interface IProfesor {

	String crear(Profesor profesor,ArrayList<Profesor> listaProfesor);
	
	void listarProfesores(ArrayList<Profesor> listaProfesores);
	
	String actualizar(String rut,ArrayList<Profesor> listaProfesores)throws IOException ;
	
	String eliminar(String rut, ArrayList<Profesor> listaProfesores);
}
