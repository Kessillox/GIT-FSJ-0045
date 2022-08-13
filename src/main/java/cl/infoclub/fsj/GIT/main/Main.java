package cl.infoclub.fsj.GIT.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Curso;
import cl.infoclub.fsj.GIT.modelo.Profesor;

public class Main {
	
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	static int opcion;
	static Curso curso = new Curso();
	static String auxRut = new String();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		do {
			opcion = menuPrincipal();
			accionesMenuPrincipal(opcion);
		}while(opcion != 6);
	}
	
	
	
	
	public static int menuPrincipal() throws NumberFormatException, IOException {
		do {
			System.out.println("\nMenu Principal.\n");
			System.out.println("1) Ingresar al menu de alumnos.");
			System.out.println("2) Ingresar al menu de profesores.");
			System.out.println("3) Listar a todos los registrados.");
			System.out.println("4) Exportar lista de todos los registrados.");
			System.out.println("5) Salir.");
			
			opcion = Integer.parseInt(bReader.readLine());
			
			if(opcion >5 || opcion < 0)System.out.println("Ingrese un numero valido para seleccionar la operacion.");
		}while(opcion >5 || opcion < 0);
		
		return opcion;
	}
	
	public static int menuAlumnos() throws NumberFormatException, IOException {
		do {
			System.out.println("\nMenu de Alumnos.\n");
			System.out.println("1) Agregar un alumno.");
			System.out.println("2) Editar un alumno.");
			System.out.println("3) Eliminar un alumno.");
			System.out.println("4) Listar a los alumnos.");
			System.out.println("5) Exportar lista alumnos.");
			System.out.println("6) Agregar nota a alumno.");
			System.out.println("7) Mostrar promedio de los alumnos.");
			System.out.println("8) Atras.");
			String op=bReader.readLine();
			opcion = Integer.parseInt(op);
			
			if(opcion >8 || opcion < 0)System.out.println("Ingrese un numero valido para seleccionar la operacion.");
		}while(opcion >8 || opcion < 0);
		return opcion;
	}
	
	public static int menuProfesores() throws NumberFormatException, IOException {
		do {
			System.out.println("\nMenu de Profesores.\n");
			System.out.println("1) Agregar un profesor.");
			System.out.println("2) Editar un profesor.");
			System.out.println("3) Eliminar un profesor.");
			System.out.println("4) Listar a los profesores.");
			System.out.println("5) Exportar lista profesores.");
			System.out.println("7) Atras.");
			opcion = Integer.parseInt(bReader.readLine());
			if(opcion >7 || opcion < 0)System.out.println("Ingrese un numero valido para seleccionar la operacion.");
		}while(opcion >7 || opcion < 0);
		return opcion;
	}
	
	
	public static void accionesMenuPrincipal(int opcion) throws NumberFormatException, IOException {
		switch(opcion) {
			
			//Ingreso a menu Alumnos
			case 1:
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			//Ingreso a menu Profesores	
			case 2:
				opcion = menuProfesores();
				accionesMenuProfesores(opcion);
				break;
				
			//Listar a todos los registrados
			case 3:
				System.out.println("Lista de todas las personas en el registro:\n");
				curso.listarAlumnos();
				curso.listarProfesores();
				break;
				
			//Exportar lista	
			case 4:
				curso.exportarAlumnos();
				curso.exportarProfesores();
				break;

			//Salir	
			case 5:
				System.out.println("Usted ha salido del programa.");
				break;
		}
	}
	
	
	public static void accionesMenuAlumnos(int opcion) throws NumberFormatException, IOException {
		switch(opcion) {
			case 1://Agregar alumno
				Alumno auxAlumno = new Alumno();
				
				System.out.println("Ingrese el Nombre de la persona:");
				auxAlumno.setNombre(bReader.readLine());
				
				System.out.println("Ingrese el Primer Apellido de la persona:");
				auxAlumno.setApellido1(bReader.readLine());
				
				System.out.println("Ingrese el Segundo Apellido de la persona:");
				auxAlumno.setApellido2(bReader.readLine());
				
				System.out.println("Ingrese la Edad de la persona:");
				auxAlumno.setEdad(Integer.parseInt(bReader.readLine()));
				
				System.out.println("Ingrese el Rut de la persona:");
				auxAlumno.setRut(bReader.readLine());
				
				System.out.println(curso.crearAlumno(auxAlumno)); 
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			case 2://Editar alumno
				System.out.println("Ingrese el rut del alumno a editar:");
				auxRut = bReader.readLine();
				System.out.println(curso.actualizarAlumno(auxRut));
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			case 3://Eliminar alumno
				System.out.println("Ingrese el rut del alumno a eliminar:");
				auxRut = bReader.readLine();
				System.out.println(curso.eliminarAlumno(auxRut));
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			case 4://Listar alumnos
				curso.listarAlumnos();
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			case 5://Exportar alumnos
				curso.exportarAlumnos();
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			case 6://Agregar nota a alumno
				System.out.println("Ingrese el rut del alumno: ");
				String auxRut = bReader.readLine();
				System.out.println("Ingrese la nota a agregar: ");
				String auxNota = bReader.readLine();
				System.out.println( curso.agregarNota(auxRut, Double.parseDouble(auxNota)) );
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
					
			case 7://Promedio alumnos
				System.out.println("El promedio del curso es: " + curso.promedioCurso() );
				opcion = menuAlumnos();
				accionesMenuAlumnos(opcion);
				break;
				
			case 8://Atras
				opcion = 0;
				break;
		}
	}
	
	
	public static void accionesMenuProfesores(int opcion) throws NumberFormatException, IOException {
		switch(opcion) {
			case 1://Agregar profesor
				Profesor auxProfesor = new Profesor();
				
				System.out.println("Ingrese el Nombre de la persona:");
				auxProfesor.setNombre(bReader.readLine());
				
				System.out.println("Ingrese el Primer Apellido de la persona:");
				auxProfesor.setApellido1(bReader.readLine());
				
				System.out.println("Ingrese el Segundo Apellido de la persona:");
				auxProfesor.setApellido2(bReader.readLine());
				
				System.out.println("Ingrese la Edad de la persona:");
				auxProfesor.setEdad(Integer.parseInt(bReader.readLine()));
				
				System.out.println("Ingrese el Rut de la persona:");
				auxProfesor.setRut(bReader.readLine());
				
				System.out.println("Ingrese la asignatura:");
				auxProfesor.setAsignatura(bReader.readLine());
				
				System.out.println(curso.crearProfesor(auxProfesor)); 
				opcion = menuProfesores();
				accionesMenuProfesores(opcion);
				break;
				
			case 2://Editar profesor
				System.out.println("Ingrese el rut del profesor a editar:");
				auxRut = bReader.readLine();
				System.out.println(curso.actualizarProfesor(auxRut));
				opcion = menuProfesores();
				accionesMenuProfesores(opcion);
				break;
				
			case 3://Eliminar profesor
				System.out.println("Ingrese el rut del profesor a eliminar:");
				auxRut = bReader.readLine();
				System.out.println(curso.eliminarProfesor(auxRut));
				opcion = menuProfesores();
				accionesMenuProfesores(opcion);
				break;
				
			case 4://Listar profesores
				curso.listarProfesores();
				opcion = menuProfesores();
				accionesMenuProfesores(opcion);
				break;
				
			case 5://Exportar profesores
				curso.exportarProfesores();
				opcion = menuProfesores();
				accionesMenuProfesores(opcion);
				break;

			case 6://Atras
				opcion = 0;
				break;
				
		}
	}
}
