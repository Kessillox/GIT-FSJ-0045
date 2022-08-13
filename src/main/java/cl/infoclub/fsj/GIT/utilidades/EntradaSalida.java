package cl.infoclub.fsj.GIT.utilidades;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
 
import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Profesor;
 
public class EntradaSalida {
 
 
 
	private String directorio;
	private File dir;
	private File archivoAlumnos;
	private File archivoProfesores;

	
 
	public EntradaSalida() {
		super();
		directorio = new String("curso/");
		dir = new File("src/"+directorio);
		archivoAlumnos = new File("src/"+directorio+"alumnos.txt");
		archivoProfesores = new File("src/"+directorio+"profesores.txt");
	}

	private void guardarArchivo(File archivo, String contenido, String mensaje) throws IOException {
		FileWriter fileW = new FileWriter(archivo);
		BufferedWriter bufferedWriter = new BufferedWriter(fileW);
		bufferedWriter.write(contenido);
		bufferedWriter.close();
		System.out.println(mensaje);
	}
 
	public void exportarAlumnos(ArrayList<Alumno> alumnos) {
 
		String contenido = "Lista de alumnos\n\n";
		String mensajeExito = "Lista de alumnos guardada exitosamente";
 
		for (Alumno alumno: alumnos) {
			contenido  = contenido + alumno.alumnoToString() + "\n";
		}
 
 
		if (!dir.exists()) {
			if (dir.mkdirs()) {
				System.out.println("Directorio "+directorio+" creado exitosamente");
			} 
		} 
 
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
 
	public void exportarProfesores(ArrayList<Profesor> profesores) {
 
		String contenido = "Lista de profesores\n\n";
		String mensajeExito = "Lista de profesores guardada exitosamente";
 
		for (Profesor profesor: profesores) {
			contenido  = contenido + profesor.profesorToString() + "\n";
		}
 
		if (!dir.exists()) {
			if (dir.mkdirs()) {
				System.out.println("Directorio "+directorio+" creado exitosamente");
			} 
		} 
 
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