package cl.generation.v20221027;

import java.util.ArrayList;
import java.util.Scanner;

import cl.generation.v20221028.Estudiante;

public class EstudianteEjercicios {

	public static void main(String[] args) {
		// Ejercicio Take Five
		menu();

	}

	public static void menu() {
		System.out.println("---------------------------------");
		System.out.println("|             MENÚ              |");
		System.out.println("---------------------------------");
		System.out.println("|  1.INGRESAR DATOS ESTUDIANTE  |");
		System.out.println("|           0.SALIR             |");
		System.out.println("---------------------------------");

		Scanner sc = new Scanner(System.in);

		Integer opciones = 0;
		System.out.println("| Seleccione una opción         |");
		opciones = sc.nextInt();

		ArrayList<String> cohorte = new ArrayList<String>();
		Estudiante estudiante = new Estudiante();

		if (opciones == 0) {
			System.out.println("| Saliendo del programa        |");
		} else if (opciones == 1) {
			do {
				System.out.println("| Ingrese el nombre del estudiante      |");
				String nombre = sc.next();
				cohorte.add(nombre);
				System.out.println("| Ingrese el apellido del estudiante      |");
				String apellido = sc.next();
				cohorte.add(apellido);
				System.out.println("| Ingrese el correo del estudiante      |");
				String correo = sc.next();
				cohorte.add(correo);

			} while (opciones == 1);
			
			
		}

	}
}
