package cl.generation.v20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//herencia en JAVA
		//Instanciando objetos
		Entrenador entrenador= new Entrenador();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAnosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		Entrenador entrenadorAyudante = new Entrenador("Cynthia","Martz",22,10,"cohorte2");		
		
		//imprimiendo los atributos del objeto
		System.out.println(entrenador.toString());
		System.out.println(entrenadorAyudante.toString());

		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("En musculos");
		
		ArrayList <Basquetbol> listaJugadores= new ArrayList<Basquetbol>();
		
		Basquetbol basque = new Basquetbol();
		basque.setNombre("Michel");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		
		listaJugadores.add(basque);//agregando una objeto a la lista
		
		Basquetbol basque2= new Basquetbol();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.5f);
		
		listaJugadores.add(basque2);
		
		//recorrer lista
		for (Basquetbol jugador : listaJugadores) {
			System.out.println(jugador.toString());
		}
		
		entrenador.metodoImprimir();
		kine.metodoImprimir();
		basque2.metodoImprimir();
		
		
		//instancia de clase nieta
		Ayudante ayudante = new Ayudante();
		ayudante.metodoImprimir();
		
		
	}

}

