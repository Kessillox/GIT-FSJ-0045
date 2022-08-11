package cl.infoclub.fsj.GIT.repositorios;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.interfaces.IPersona;
import cl.infoclub.fsj.GIT.modelo.Persona;

public abstract class PersonaRepo implements IPersona {
	
	
	ArrayList<Persona> Persona = new ArrayList<Persona>();
	

	public ArrayList<Persona> getPersona() {
		return Persona;
	}

	public void setPersona(ArrayList<Persona> persona) {
		Persona = persona;
	}

	public void crear (Persona prs) {
		this.Persona.add(prs);
		
	}
	
	public void listar() {
		for (int i= 0;i<Persona.size();i++) {
				System.out.println(getPersona().get(i));
			
		}
	}
	
	public void actualizar (Persona persona) {

		
	}
	public void eliminar(Persona persona) {
	}

}