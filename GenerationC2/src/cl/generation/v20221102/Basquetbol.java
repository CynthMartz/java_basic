package cl.generation.v20221102;

public class Basquetbol extends EquipoBasquetbol {
	
	private Float peso;
	private Float altura;
	public Basquetbol() {
		super();
	}
	public Basquetbol(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	@Override
	public void metodoImprimir() {
		System.out.println("estoy en el metodo de la clase hija basquetbol");
	}
	
	
}
