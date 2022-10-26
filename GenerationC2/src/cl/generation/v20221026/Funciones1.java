package cl.generation.v20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// Funciones o metodo
		// llamar a un metodo
		nombremetodo();
		metodo2("Cynthia");
		metodo2("Martz");
		metodo3(23);
		metodo4(77, 9.9f);
		String[] losarreglos = { "a", "b", "c" };
		metodo5(losarreglos);
		// metodos con llamadas
		retorno1();

		String nombreCompleto = getNombreCompleto("Cynthia", "Martz", "Ayala");
		System.out.println("El nombre completo " + nombreCompleto);
		
		llamadaOtroMetodo();

	}

//definicion o estructura de un metodo
//void= el metdo no retorna ningun valor

	public static void nombremetodo() {

		System.out.println("Estoy dentro del metodo inicial... ");

	}

	public static void metodo2(String nombre) {

		System.out.println("Soy " + nombre);

	}

	public static void metodo3(Integer numeros) {

		System.out.println("Soy el nro " + numeros);

	}

	public static void metodo4(int numeros1, Float numeros2) {

		System.out.println("Soy el nro " + numeros1);
		System.out.println("Soy el nro " + numeros2);

	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));

	}

	// Funciones con retorno

	public static int retorno1() {
		int totalAlumnos = 25;
		return totalAlumnos;

	}

	/**
	 * Metodo que une todos los datos
	 * 
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	public static String getNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto; // retornamos el contenido de la variable

	}
	
	//metodo que llama a otro metodo
	
	public static void llamadaOtroMetodo() {
		System.out.println("Llamda a otro metodo desde un metodo");
		metodo4(1234,54.3f);
		
	}

}