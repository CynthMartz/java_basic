package cl.generation.v20221025;

import java.util.HashMap;
import java.util.Map;

public class ArregloHashMap {

	public static void main(String[] args) {
		
		//HashMap
		//llave - valor
		
		
		
		
		
		HashMap <String, Integer > takefive = new HashMap<String, Integer>();
		
		takefive.put("Kiara", 12);
		takefive.put("Cynthia", 16);
		takefive.put("Luis", 18);
		takefive.put("Pablo", 11);
		takefive.put("Daniel", 19);
		System.out.println(takefive);
		
		//Bucle = keySet()método si solo quiere las claves, y use el values()método si solo quiere los valores
		
		for (String i : takefive.keySet()) {
			  System.out.println(i);
			}
		for (Integer i : takefive.values()) {
			  System.out.println(i);
			}
		for (String i : takefive.keySet()) {
			  System.out.println("key: " + i + " value: " + takefive.get(i));
			}
		
		System.out.println("*********************");
		
		
		// Iterador en un HashMap
		
		for (Map.Entry<String, Integer> set: takefive.entrySet()) {
			 
           // Imprimimos elemento y valor 
           System.out.println(set.getKey() + " = " + set.getValue());
			
		}
		
		System.out.println("*********************");
		
		
		// eliminar un elemento
		
		 takefive.remove("Luis");
		 System.out.println(takefive);
	
		//- tamaño del arreglo
		 System.out.println("Los takers "+takefive.size());
		 
		 
	}
	
 
}
