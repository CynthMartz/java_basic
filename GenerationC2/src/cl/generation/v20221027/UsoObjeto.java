package cl.generation.v20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// instancia de clase (referencia de un objeto( -- para asignar un valor a un atributo debe estar publico
		Auto auto1 = new Auto();
		//auto1.color()
		//asignar valores a atributos privados * solo a traves del metodo setter
		auto1.setColor("rojo"); 
		auto1.setMarca("Peugeot");
		
		
		
		//consultar el contenido de los atributos
		System.out.println(auto1.getColor());
		
		
		
		//para saber el contenido de los atributos
		System.out.println(auto1.toString());
	
		//nueva instancia de Auto
		Auto car = new Auto ("Nissan", "Negro", "Qashqai", 1.6f, 10.0f, 240f);
		System.out.println(car.getModelo());
		
		auto1.setRendimiento(8.7f);
		System.out.println(car.toString());
		
	}

}
