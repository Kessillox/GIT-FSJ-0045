package cl.infoclub.fsj.GIT.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	static int opcion;
	
	
	
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
			System.out.println("\nMenu de Profesores.\n(Ingrese un numero valido para seleccionar la operacion)\n");
			System.out.println("1) Agregar un profesor.");
			System.out.println("2) Editar un profesor.");
			System.out.println("3) Eliminar un profesor.");
			System.out.println("4) Listar a los profesores.");
			System.out.println("5) Exportar lista profesores.");
			System.out.println("6) Importar lista profresores.");
			System.out.println("7) Atras.");
			opcion = Integer.parseInt(bReader.readLine());
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
				
			//Importar lista	
			case 5:
				System.out.println("Su lista ha sido importada con éxito. ");
				
			//Salir	
			case 6:
				System.out.println("Usted ha salido del programa.");
				break;
		}
	}
	
	
	public static void accionesMenuAlumnos(int opcion) throws NumberFormatException, IOException {
		
		switch(opcion) {
			case 1://Agregar alumno
				
				break;
				
			case 2://Editar alumno
				
				break;
				
			case 3://Eliminar alumno
				
				break;
				
			case 4://Listar alumnos
				
				break;
				
			case 5://Promedio alumnos
				
				break;
				
			case 6://Atras
				
				opcion = 0;
				break;
		}
	}
	
	public static void accionesMenuProfesores(int opcion) throws NumberFormatException, IOException {
		switch(opcion) {
			case 1://Agregar profesor
				
				break;
				
			case 2://Editar profesor
				
				break;
				
			case 3://Eliminar profesor
				
				break;
				
			case 4://Listar profesores
				
				break;
				
			case 5://Atras
				opcion = 0;
				break;
		}
	}
}
