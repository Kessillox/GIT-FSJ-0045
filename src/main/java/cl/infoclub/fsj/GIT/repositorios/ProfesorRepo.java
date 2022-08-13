package cl.infoclub.fsj.GIT.repositorios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.interfaces.IProfesor;
import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Profesor;

public abstract class ProfesorRepo implements IProfesor {
	
ArrayList<Profesor> profesoresLista = new ArrayList<Profesor>();
	
	public ArrayList<Profesor> getProfesor() {
		return profesoresLista;
	}

	public void setProfesor(ArrayList<Profesor> profesor) {
		this.profesoresLista = profesor;
	}

	public void crearProfesor(Profesor pr) {
		this.profesoresLista.add(pr);
		
	}
	
	public void listarProfesor() {
		for (int i= 0;i<profesoresLista.size();i++) {
				System.out.println(getProfesor().get(i));
			
		}
	}
	
	/*edit actualizar*/
	@SuppressWarnings("unlikely-arg-type")
	public boolean actualizarProfesor(String rut) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		for(Profesor profesor: profesoresLista) {
			if(profesor.getRut().equals(bufferedReader)) {
				System.out.println("\nSe ha encontrado el profesor.\nEsta es la informacion del profesor." + profesor.toString() );
				System.out.println("\nSeleccione la opcion a editar.");
			
				String opcion = new String(bufferedReader.readLine());
				switch(opcion){
					case "1":
						System.out.println("Ingrese el nuevo nombre: ");
						profesor.setNombre(bufferedReader.readLine());
						break;
					case "2":
						System.out.println("Ingrese el nuevo apellido 1: ");
						profesor.setApellido1(bufferedReader.readLine());
						break;
					case "3":
						System.out.println("Ingrese el nuevo apellido 2: ");
						profesor.setApellido2(bufferedReader.readLine());
						break;
					case "4":
						System.out.println("Ingrese la nueva asignatura: ");
						profesor.setAsignatura(bufferedReader.readLine());
						break;	
				}
				//System.out.println("el nuevo alumno es:\n"+ alumno.toString());
				System.out.println("El nuevo profesor es:" +profesor.toString()) ;
					
				}
				return true;
		}
		System.out.println("No se ha encontrado el alumno.\n");
		return false;
	}/*fin actualizar*/
	public String eliminarProfesor(String rut) {
		for (Profesor auxProfesor:profesoresLista ) {
			if (rut.equals(auxProfesor.getRut())) {
				profesoresLista.remove(auxProfesor);
				return "Profesor Eliminado con exito";
			}
	}
	return "No se elimino al Profesor por no encontrarse en la lista";
	}
}
	