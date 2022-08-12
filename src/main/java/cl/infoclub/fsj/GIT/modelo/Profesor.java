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
	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", getNombre()=" + getNombre() + ", getApellido1()="
				+ getApellido1() + ", getApellido2()=" + getApellido2() + ", getEdad()=" + getEdad() + ", getRut()="
				+ getRut() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
	
}
