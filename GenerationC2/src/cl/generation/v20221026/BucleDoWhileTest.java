package cl.generation.v20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		//dowhile
		//a lo menos se ejecuta una vez
		
		Scanner sc = new Scanner (System.in);
		int edad= 0;
		Float kilos = 0f;
		Float estatura = 0f;
		
		
		
		do {
			System.out.println("Ingresa tu edad");
			edad= sc.nextInt();
		} while (edad < 18  || edad>120);
			System.out.println("Edad ingresada "+edad);
			
		//peso
		do {
			System.out.println("Ingresa tu peso");
			kilos= sc.nextFloat();
		} while (kilos <40 || kilos>150);	
			System.out.println("peso ingresado es "+kilos);
			
			//estatura
		do {
			System.out.println("Ingresa tu estatura");
			estatura = sc.nextFloat();
		} while (estatura < 0 || estatura>3);	
			System.out.println("estatura ingresado es "+estatura);			
			
		
		sc.close();
	}

}
