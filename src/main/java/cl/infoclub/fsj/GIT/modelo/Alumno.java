package cl.infoclub.fsj.GIT.modelo;

public class Alumno extends Persona {

	private double nota;
	private int numeroLista;
	private String curso;
	public Alumno(double nota, int numeroLista, String curso) {
		super();
		this.nota = nota;
		this.numeroLista = numeroLista;
		this.curso = curso;
	}
	public Alumno() {
		super();
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getNumeroLista() {
		return numeroLista;
	}
	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", numeroLista=" + numeroLista + ", curso=" + curso + "]";
	}
	
	
	
}
