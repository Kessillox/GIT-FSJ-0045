package cl.infoclub.fsj.GIT.utilidades;
<<<<<<< HEAD

=======
 
>>>>>>> main
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
<<<<<<< HEAD

import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Profesor;

public class EntradaSalida {

	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	
=======
 
import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Profesor;
 
public class EntradaSalida {
 
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	ArrayList<Profesor> profesores = new ArrayList<Profesor>();
 
>>>>>>> main
	String directorio = new String("curso/");
	File dir = new File("src/"+directorio);
	File archivoAlumnos = new File("src/"+directorio+"alumnos.txt");
	File archivoProfesores = new File("src/"+directorio+"profesores.txt");
<<<<<<< HEAD
	
=======
 
>>>>>>> main
	private void guardarArchivo(File archivo, String contenido, String mensaje) throws IOException {
		FileWriter fileW = new FileWriter(archivo);
		BufferedWriter bufferedWriter = new BufferedWriter(fileW);
		bufferedWriter.write(contenido);
		bufferedWriter.close();
		System.out.println(mensaje);
	}
<<<<<<< HEAD
	
	public void exportarAlumnos() {
		
		String contenido = "Lista de alumnos\n\n";
		String mensajeExito = "Lista de alumnos guardada exitosamente";
		
		for (Alumno alumno: alumnos) {
			contenido  = contenido + alumno.toString() + "\n";
		}
				
=======
 
	public void exportarAlumnos() {
 
		String contenido = "Lista de alumnos\n\n";
		String mensajeExito = "Lista de alumnos guardada exitosamente";
 
		for (Alumno alumno: alumnos) {
			contenido  = contenido + alumno.toString() + "\n";
		}
 
>>>>>>> main
		if (!dir.exists()) {
			if (dir.mkdirs()) {
				System.out.println("Directorio "+directorio+" creado exitosamente");
			} 
		} 
<<<<<<< HEAD
		
=======
 
>>>>>>> main
		if (!archivoAlumnos.exists()) {
			try {
				archivoAlumnos.createNewFile();
				guardarArchivo(archivoAlumnos, contenido, mensajeExito);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error de E/S");
			} 
		} else {
			try {
				guardarArchivo(archivoAlumnos, contenido, mensajeExito);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error de E/S");
			} 
		}
	}
<<<<<<< HEAD
	
	public void exportarProfesores() {
		
		String contenido = "Lista de profesores\n\n";
		String mensajeExito = "Lista de profesores guardada exitosamente";
		
		for (Profesor profesor: profesores) {
			contenido  = contenido + profesor.toString() + "\n";
		}
				
=======
 
	public void exportarProfesores() {
 
		String contenido = "Lista de profesores\n\n";
		String mensajeExito = "Lista de profesores guardada exitosamente";
 
		for (Profesor profesor: profesores) {
			contenido  = contenido + profesor.toString() + "\n";
		}
 
>>>>>>> main
		if (!dir.exists()) {
			if (dir.mkdirs()) {
				System.out.println("Directorio "+directorio+" creado exitosamente");
			} 
		} 
<<<<<<< HEAD
		
=======
 
>>>>>>> main
		if (!archivoProfesores.exists()) {
			try {
				archivoProfesores.createNewFile();
				guardarArchivo(archivoProfesores, contenido, mensajeExito);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error de E/S");
			} 
		} else {
			try {
				guardarArchivo(archivoProfesores, contenido, mensajeExito);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error de E/S");
			} 
		}
	}
}
<<<<<<< HEAD
=======
 
>>>>>>> main
