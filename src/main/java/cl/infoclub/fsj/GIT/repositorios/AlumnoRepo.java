package cl.infoclub.fsj.GIT.repositorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import cl.infoclub.fsj.GIT.interfaces.IAlumno;
import cl.infoclub.fsj.GIT.modelo.Alumno;

public class AlumnoRepo implements IAlumno {
	
	public String crear (Alumno al,ArrayList<Alumno> alumnos) {
		for(Alumno auxAlumno:alumnos) {//TODO
			if(auxAlumno.getRut().equals(al.getRut())) {
				return "No se pudo crear alumno porque ya existe";	
			}
		}
		alumnos.add(al);
		return "Se agrego al alumno exitosamente";	
	}
	
	public void listarAlumno(ArrayList<Alumno> alumnos) {
		System.out.println("La lista de alumnos es: \n");
		for (Alumno auxAlumno:alumnos) {
				System.out.println(auxAlumno.toString());
		}
		
	}
	///*edit actualizar*/
	public String actualizarAlumno(String rut, ArrayList<Alumno> alumnos) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		for(Alumno alumno: alumnos) {
			if(alumno.getRut().equals(rut)) {
				System.out.println("\nSe ha encontrado el alumno.\nEsta es la informacion del alumno." + alumno.toString() );
				System.out.println("\nSeleccione la opcion a editar.");
			
				String opcion = new String(bufferedReader.readLine());
				switch(opcion){
					case "1":
						System.out.println("Ingrese el nuevo nombre: ");
						alumno.setNombre(bufferedReader.readLine());
						break;
					case "2":
						System.out.println("Ingrese el nuevo apellido 1: ");
						alumno.setApellido1(bufferedReader.readLine());
						break;
					case "3":
						System.out.println("Ingrese el nuevo apellido 2: ");
						alumno.setApellido2(bufferedReader.readLine());
						break;
					case "4":
						System.out.println("Ingrese la nueva edad: ");
						String auxEdad =  bufferedReader.readLine();
						alumno.setEdad(Integer.parseInt(auxEdad));
						break;	
					case "5":
						System.out.println("Ingrese el nuevo rut: ");
						alumno.setRut(bufferedReader.readLine());
						break;	
				}
				System.out.println("El nuevo alumno es:" +alumno.toString()) ;
					
				}
				return "Se ha modificado con exito los datos del alumno";
		}
		System.out.println("No se ha encontrado el alumno.\n");
		return "No se pudo modificar el Alumno";
	}/*fin actualizar*/
	
	public String eliminarAlumno(String rut, ArrayList<Alumno> alumnos) {
		
				
		 for (Alumno auxAlumno: alumnos) {
				if (rut.equals(auxAlumno.getRut())) {
					alumnos.remove(auxAlumno);
					return "Alumno Eliminado con exito";
				}
		}
		return "No se elimino al Alumno por no encontrarse en la lista";
		
	}
	public double promedio(ArrayList<Double> notas ) {
		Double sumaNotas=0.0;
		
		for(Double nota:notas) {
			sumaNotas=+nota;
		}
		return sumaNotas/notas.size();
	}	

	
}

