package cl.generation.v20221102.interfaces;

public class Persona extends Humano {
	//atributos que hereda
	/* altura
	 * peso
	 * razonamiento
	 */
	private String dni;
	//metodos
	/*metodoEnAnimal
	*respirar 
	*comer*/

	public Persona() {
		super();
	}

	public Persona(String dni) {
		super();
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
