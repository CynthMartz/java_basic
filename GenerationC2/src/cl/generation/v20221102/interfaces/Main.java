package cl.generation.v20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces y clases abstractas - no se implemenra la clase abstracta

		//no se puede instanciar clases abstractas
		//Animal animal = new Animal();
		Caballo caballo =new Caballo();
		caballo.setAltura(2.5f);
		
		Humano humano =new Humano();
		humano.metodoEnAnimal();
		
		Leon leon= new Leon();
		leon.setAltura(2.04f);
		leon.setPeso(200f);
		//imprimir los valores seteados
		//System.out.println("altura"+leon.getAltura);
		//System.out.println("peso"+leon.getPeso);
		System.out.println(leon.toString());
		//impirmir come carne
		leon.metodoEnAnimal();
		
		
		Persona persona =new Persona();
		persona.metodoEnAnimal();
	}

}
