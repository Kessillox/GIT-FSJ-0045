package cl.infoclub.fsj.GIT.repositorios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cl.infoclub.fsj.GIT.interfaces.IProfesor;
import cl.infoclub.fsj.GIT.modelo.Profesor;

public class ProfesorRepo implements IProfesor {
	
	
	public ProfesorRepo() {
		super();
	}


	public String crear(Profesor profe, ArrayList<Profesor> listaProfesores) {
		for (Profesor auxProfesor:listaProfesores) {
			if(auxProfesor.getRut().equals(profe.getRut()))
				return "No se pudo crear profesor porque ya existe";
		}
		listaProfesores.add(profe);
		return "Profesor Creado";
	}
	
	
	
	public void listarProfesores(ArrayList<Profesor> listaProfesores) {
		System.out.println("Los profesores de la escuela son: \n");	
		for(Profesor auxProfesor:listaProfesores) {
			System.out.println(auxProfesor.profesorToString());
		}
	}
	
	public String actualizar(String rut,ArrayList<Profesor> listaProfesores) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		for(Profesor profe: listaProfesores) {
			if(profe.getRut().equals(rut)) {
				System.out.println("\nSe ha encontrado el profesor.\nEsta es la informacion del profesor." + profe.profesorToString() );
				System.out.println("\nSeleccione la opcion a editar.");
				
				String opcion = new String(bufferedReader.readLine());
				switch(opcion){
					case "1":
						System.out.println("Ingrese el nuevo nombre: ");
						profe.setNombre(bufferedReader.readLine());
						break;
					case "2":
						System.out.println("Ingrese el nuevo apellido 1: ");
						profe.setApellido1(bufferedReader.readLine());
						break;
					case "3":
						System.out.println("Ingrese el nuevo apellido 2: ");
						profe.setApellido2(bufferedReader.readLine());
						break;
					case "4":
						System.out.println("Ingrese la nueva edad: ");
						String auxEdad =  bufferedReader.readLine();
						profe.setEdad(Integer.parseInt(auxEdad));
						break;	
					case "5":
						System.out.println("Ingrese el nuevo rut: ");
						profe.setRut(bufferedReader.readLine());
						break;	
				}
				System.out.println("El nuevo profesor es:" +profe.profesorToString() +"\n") ;
				return "Se ha modificado con exito los datos del profesor";

			}
		
		}
		return "No se ha modificado el profesor debido a que no existe en el registro.";
	}
	
	
	public String eliminar(String rut, ArrayList<Profesor> listaProfesores) {
		for (Profesor auxProfesor:listaProfesores ) {
			if (rut.equals(auxProfesor.getRut())) {
				listaProfesores.remove(auxProfesor);
				return "Profesor Eliminado con exito";
			}
		}
		return "No se elimino al Profesor por no encontrarse en la lista";
	}
}
	