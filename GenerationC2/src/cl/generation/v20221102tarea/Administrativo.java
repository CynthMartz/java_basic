package cl.generation.v20221102tarea;

public class Administrativo extends Colegio{

	private String titulo;
	private String cargo;
	public Administrativo() {
		super();
	}
	public Administrativo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.cargo = especialidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
