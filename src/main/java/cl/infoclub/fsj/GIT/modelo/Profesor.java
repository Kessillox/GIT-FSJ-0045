package cl.infoclub.fsj.GIT.modelo;

public class Profesor extends Persona {

	private String asignatura;

	public Profesor() {
		super();
		asignatura = new String();
	}

	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String profesorToString() {
		return "Profesor:\n1.- Nombre: " + getNombre() + "\n2.- Primer Apellido: " + getApellido1() + "\n3.- Segundo Apellido: "
				+ getApellido2() + "\n4.- Edad: " + getEdad() + "\n5.- Rut: " + getRut()+ "\n6.- Asignatura: " + asignatura;
	}
	
}
