package cl.infoclub.fsj.GIT.modelo;

public class Profesor extends Persona {

	private String asignatura;
	private String nivel;
	private int horasDeClase;
	
	public Profesor(String asignatura, String nivel, int horasDeClase) {
		super();
		this.asignatura = asignatura;
		this.nivel = nivel;
		this.horasDeClase = horasDeClase;
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
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getHorasDeClase() {
		return horasDeClase;
	}
	public void setHorasDeClase(int horasDeClase) {
		this.horasDeClase = horasDeClase;
	}
	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", nivel=" + nivel + ", horasDeClase=" + horasDeClase + "]";
	}
	
	
	
}
