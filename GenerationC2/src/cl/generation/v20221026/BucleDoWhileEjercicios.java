package cl.generation.v20221026;

import java.util.Scanner;

public class BucleDoWhileEjercicios {

	public static void main(String[] args) {
		
		String nombreCompleto = getNombreCompleto("Carolos", "Perez", "Sanchez", 35);
		Float IMC = calculoIMC();
		nivelIMC(IMC);
		}
		
	

	public static String getNombreCompleto(String nombre, String apePaterno, String apeMaterno, int edad) {
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno+" "+edad;
		return nombreCompleto;
	}
	public static Float calculoIMC() {
		// Capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);

		// calculo del IMC
		//// imc= kilos/(estaTura*estatura);
		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();
		

		System.out.println("Ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		

		Float IMC = peso / (estatura * estatura);
		

		scanner.close();

		return IMC;
		
	}
	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */

		if (IMC < 18.5f) {
			System.out.println("El paciente está bajo de peso");
			
		} else if (IMC >= 18.5F && IMC < 25) {
			System.out.println("El paciente está en el rango Normal");

		} else if (IMC >= 25F && IMC < 30) {
			System.out.println("El paciente está con SOBREPESO");

		} else {
		System.out.println("El paciente está con OBESO");
		}
		System.out.println("El paciente"+nombreCompleto,);
	}
	
	
}
