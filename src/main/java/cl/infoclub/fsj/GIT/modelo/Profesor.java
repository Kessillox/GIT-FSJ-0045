package cl.infoclub.fsj.GIT.modelo;

public class Profesor extends Persona {

	private String asignatura;

	public Profesor(String asignatura) {
		super();
		this.asignatura = asignatura;
	}
	public Profesor() {
		super();
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String profesorToString() {
		return "Alumno:\n1.- Nombre =" + getNombre() + "\n2.- Apellido1=" + getApellido1() + "\n3.- Apellido2="
				+ getApellido2() + "\n4.- Edad()=" + getEdad() + "\n5.- Rut()=" + getRut()+ "\n6.- asignatura=" + asignatura;
	}
	
}
