package cl.generation.v20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		//set o hashset -- definicion
		//HashSet<Tipodedato> nombre_array = HashSet<tipodedato>();
		HashSet<String> takefive = new HashSet<String>();
		
		//2- agregar elemento al arreglo // no acepta datos duplicados
		takefive.add("Kiara");
		takefive.add("Cynthia");
		takefive.add("Luis");
		takefive.add("Pablo");
		takefive.add("Daniel");
		System.out.println(takefive);
		
		
		//3- verificar el contenido del arreglo
		 boolean verificacionNombre = takefive.contains("Luis");
		 System.out.println("Existe el taker "+verificacionNombre);
		
		//4- eliminar un elemento
		 takefive.remove("Kiara");
		 System.out.println(takefive);
		
		//- tamaño del arreglo
		 System.out.println("Los takers "+takefive.size());
		
		//6- recorrer el arreglo
		
		//Hashmap definicion, funionalidas, recorrido, y hacer comparaciones a los dos arrglos anteriores
		 
		 //como rrecorrer un arreglo con while y con iterator
		
	}

}
