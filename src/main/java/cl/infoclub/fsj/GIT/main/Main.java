package cl.infoclub.fsj.GIT.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import cl.infoclub.fsj.GIT.modelo.Alumno;
import cl.infoclub.fsj.GIT.modelo.Curso;

public class Main {
	
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	static int opcion;
	static Curso curso;
	
	
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
			System.out.println("5) Importar lista nueva.");
			System.out.println("6) Salir.");
			
			opcion = Integer.parseInt(bReader.readLine());
			
			if(opcion >6 || opcion < 0)System.out.println("Ingrese un numero valido para seleccionar la operacion.");
		}while(opcion >6 || opcion < 0);
		
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
			System.out.println("6) Importar lista alumnos");
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
			System.out.println("6) Importar lista profresores.");
			System.out.println("7) Atras.");
			opcion = Integer.parseInt(bReader.readLine());
			if(opcion >8 || opcion < 0)System.out.println("Ingrese un numero valido para seleccionar la operacion.");
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
				break;
				
			//Exportar lista	
			case 4:
				System.out.println("Su lista ha sido exportada con éxito.");
				break;
			//Importar lista	
			case 5:
				System.out.println("Su lista ha sido importada con éxito. ");
				break;
			//Salir	
			case 6:
				System.out.println("Usted ha salido del programa.");
				break;
		}
	}
	
	
	public static void accionesMenuAlumnos(int opcion) throws NumberFormatException, IOException {

		
		switch(opcion) {
			case 1://Agregar alumno
				opcion = menuAlumnos();
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
				//TODO
				break;
				
			case 2://Editar alumno
				opcion = menuAlumnos();
				break;
				
			case 3://Eliminar alumno
				opcion = menuAlumnos();
				break;
				
			case 4://Listar alumnos
				opcion = menuAlumnos();
				break;
				
			case 5://Exportar alumnos
				System.out.println("Su lista ha sido exportada con éxito.");
				opcion = menuAlumnos();
				break;
				
			case 6://Importar alumnos
				System.out.println("Su lista ha sido importada con éxito. ");
				opcion = menuAlumnos();
				break;	
				
			case 7://Promedio alumnos
				opcion = menuAlumnos();
				break;
				
			case 8://Atras
				opcion = 0;
				break;
		}
	}
	
	public static void accionesMenuProfesores(int opcion) throws NumberFormatException, IOException {
		switch(opcion) {
			case 1://Agregar profesor
				opcion = menuProfesores();
				break;
				
			case 2://Editar profesor
				opcion = menuProfesores();
				break;
				
			case 3://Eliminar profesor
				opcion = menuProfesores();
				break;
				
			case 4://Listar profesores
				opcion = menuProfesores();
				break;
				
			case 5://Exportar profesores
				System.out.println("Su lista ha sido exportada con éxito.");
				opcion = menuProfesores();
				break;
				
			case 6://Importar profesores
				System.out.println("Su lista ha sido importada con éxito. ");
				opcion = menuProfesores();
				break;
				
			case 7://Atras
				opcion = 0;
				break;
				
		}
	}
}
