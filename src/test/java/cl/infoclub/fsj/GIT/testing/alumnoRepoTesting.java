package cl.infoclub.fsj.GIT.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Curso;

@DisplayName("TestCurso")
public class alumnoRepoTesting {
	private static Logger log = Logger.getLogger("cl.infoclub.fsj.testing.servicioPersonaTest");

	@Test
	public void testCrearAlumno() {
		log.info("info test crear alumno");
		Curso curso = new Curso();
		Alumno alumnoX= new Alumno( "Oscar",  "Zapata",  "gutierrez", 26,"194213972");
		String respAlumno = curso.crearAlumno(alumnoX);
		assertEquals("Se agrego al alumno exitosamente",respAlumno);
	}

	
	@Test
	public void testEliminarAlumno(){
		log.info("info test crear alumno");
		Alumno alumnoX= new Alumno( "Oscar",  "Zapata",  "gutierrez", 26,"194213972");
		Curso curso = new Curso();
		curso.crearAlumno(alumnoX);
		String respServicio = curso.eliminarAlumno("194213972");
		assertEquals("Alumno Eliminado con exito", respServicio);
	}
	
	@Test
	public void testActualizarAlumno() throws IOException {
		log.info("info test actualizar alumno");
		Alumno alumnoX= new Alumno( "Oscar",  "Zapata",  "gutierrez", 26,"194213972");
		Curso curso = new Curso();
		curso.crearAlumno(alumnoX);
		String respServicio = curso.actualizarAlumno("194213972");
		assertEquals("Se ha modificado con exito los datos del alumno",respServicio);
	}
	
	@Test
	public void testListarAlumnos() {
		log.info("info test listar persona");
		Alumno alumnoX= new Alumno( "Oscar",  "Zapata",  "gutierrez", 26,"194213972");
		Curso curso = new Curso();
		curso.crearAlumno(alumnoX);
		String respServicio = curso.listarAlumnos();;
		assertEquals("Lista mostrada exitosamente",respServicio);
	}
}
