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

public abstract class AlumnoRepo implements IAlumno {

	//ArrayList<Alumno> alumnosLista = new ArrayList<Alumno>();
	Alumno alumnos = new Alumno();
	private int min;
	
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
				//System.out.println("el nuevo alumno es:\n"+ alumno.toString());
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
	public double promedio(double nota1, double nota2, double nota3) {
		double promedio = 0;
		promedio = (nota1+nota2 + nota3)/3; 
		return promedio;
	}
	/***inicio exportar***/
	public void exportar(Alumno alumno) {
		
		System.out.println("Ingrese la ruta donde desea guardar el archivo .TXT");
		Scanner sc = new Scanner (System.in);
		String directo = sc.next();
		//File directorio = new File(directo);
	    File directorio = new File("src/test/java");
		
		File documento = new File(directo+"/alumnos"+ nombreDocumento(0,10)+".txt");
		if (directorio.mkdir()) {
			if (directorio.exists()) {
				System.out.println("Carpeta creada");
			}
		}else {
		System.out.println("Carpeta creada con anterioridad");
		}
		
		if (documento.exists()==false) {
			try {
				documento.createNewFile();
				System.out.println("Archivo creado");
				FileWriter escritura = new FileWriter(documento);
				try (BufferedWriter escrituraTex= new BufferedWriter(escritura)) {
						escrituraTex.write("Nombre del alumno: " + alumno.getNombre());
						escrituraTex.newLine();
						escrituraTex.write("Apellido 1: " + alumno.getApellido1());
						escrituraTex.newLine();
						escrituraTex.write("Apellido 2: " + alumno.getApellido2());
						escrituraTex.newLine();
						escrituraTex.write("Edad: " + alumno.getEdad());
						escrituraTex.newLine();
						escrituraTex.write("Rut: " + alumno.getRut());
						escrituraTex.newLine();
						escrituraTex.write("Notas del Alumno son: " + alumno.getListaNotas());
						
						escrituraTex.newLine();						
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			}
		}/***fin exportar****/
	public int nombreDocumento(int min, int max) {
		return this.min;
	}
	
}

