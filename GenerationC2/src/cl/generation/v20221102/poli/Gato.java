package cl.generation.v20221102.poli;

public class Gato extends Mascotas{

	private String sonido;

	
	
	public Gato() {
		super();
	}

	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + "]";
	}

	@Override
	public void emitirSonido() {
		System.out.println("Sonido es... Miau");
	}
	
}
