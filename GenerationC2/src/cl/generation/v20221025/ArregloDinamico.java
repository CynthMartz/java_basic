package cl.generation.v20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		//ArrayList -- Definicion
		//ArrayList<Tipodedato> nombre_array = ArrayList<tipodedato>();
		
		ArrayList<String> takefive = new ArrayList<String>();
		//2-Agregar valores al arreglo
		
		takefive.add("Kiara");
		takefive.add("Cynthia");
		takefive.add("Luis");
		takefive.add("Pablo");
		takefive.add("Daniel");
		System.out.println(takefive);
		
		//3-tamaño del arraylist   SIZE DINAMICO --- LENGHT ESTATICO
		
		System.out.println(takefive.size());
		
		//4 obtener  un elemento dentro del arreglo
		
		System.out.println(takefive.get(3));
		//System.out.println(takefive.get(7)); // fuera de indice
		
		//5- eliminar un elemento dentro del array 
		takefive.remove(4);
		System.out.println(takefive);
		
		//6- Recorrer el arrayList
		for(int i=0; i<takefive.size();i++) {
		System.out.println("Grupo: "+takefive.get(i));
		}
		System.out.println("**********************");
		//for iterador o for de objeto
		for(String take: takefive){   //take= relator -- takefive= relatores
		System.out.println(take);
		}
		//Ejemplo con otro tipo de dato
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(Integer numero :numeros) {
			System.out.println(numero);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
