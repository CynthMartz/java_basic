package cl.generation.v20221102.interfaces;

public class Leon extends Carnivoro{
	//altura peso y metodos lo tiene heredado
	
	public void metodoEnAnimal() {
		System.out.println("Leon come carne");
	}

	@Override
	public String toString() {
		return "Leon [getPeso()=" + getPeso() + ", getAltura()=" + getAltura() + "]";
	}
	
}
