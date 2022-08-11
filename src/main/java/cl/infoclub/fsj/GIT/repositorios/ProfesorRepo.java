package cl.infoclub.fsj.GIT.repositorios;

import java.util.ArrayList;

import cl.infoclub.fsj.GIT.interfaces.IProfesor;
import cl.infoclub.fsj.GIT.modelo.Profesor;

public abstract class ProfesorRepo implements IProfesor {
	
	
	ArrayList<Profesor> Profesor = new ArrayList<Profesor>();
	
	
	public ArrayList<Profesor> getProfesor() {
		return Profesor;
	}

	public void setProfesor(ArrayList<Profesor> profesor) {
		Profesor = profesor;
	}


	public void crear (Profesor pr) {
		this.Profesor.add(pr);
		
	}
	
	public void listar() {
		for (int i= 0;i<Profesor.size();i++) {
				System.out.println(getProfesor().get(i));
			
		}
	}
	
	public void actualizar (Profesor profesor) {

		
	}
	public void eliminar(Profesor profesor) {
	}

}