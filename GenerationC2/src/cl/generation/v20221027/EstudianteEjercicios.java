package cl.generation.v20221027;

import java.util.ArrayList;
import java.util.Scanner;

import cl.generation.v20221028.Estudiante;

public class EstudianteEjercicios {

	/*public static void main(String[] args) {

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
				String nombre = sc.nextLine();
				cohorte.add(nombre);
				System.out.println("| Ingrese el apellido del estudiante      |");
				String apellido = sc.nextLine();
				cohorte.add(apellido);
				System.out.println("| Ingrese el correo del estudiante      |");
				String correo = sc.next();
				cohorte.add(correo);

			} while (opciones == 1);
			
			
		}

	}*/

//// ejercicio del profe

   
	public static void main(String[] args) {
		// instanciar a Estudiante
		Estudiante estudiante = new Estudiante("Mijail","Loren","27868123-4");
		//System.out.println(estudiante.toString());
		estudiante.setEdad(3);
		estudiante.setCorreo("m@m.cl");
		estudiante.setCurso("1A");
		//System.out.println(estudiante.toString());
		
		Scanner sc = new Scanner(System.in);
		//arrelo de estudiantes
		ArrayList<Estudiante> lista_estudiantes= new ArrayList<Estudiante>();
		//String nombre= "";
		
		int continuar=2;
		do {
			
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine();// israel alexis
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();
			//instancia al objeto estudiante 
			//Estudiante estudiante = new Estudiante(nombre,apellido);
			Estudiante alumno = new Estudiante();
			//asignando un valor al atributo del objeto
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			//agregamos un objeto al arreglo con add
			lista_estudiantes.add(estudiante);
			
			
			System.out.println("Quiere agregar otro estudiante");
			System.out.println("(1)SI  (2)NO");
			continuar= sc.nextInt();
			sc.nextLine();//corrige el error de capturar un numero y despues solicitar un string
			
		} while (continuar==1);
		System.out.println("******************");
		for (Estudiante alumno : lista_estudiantes) {
			System.out.println("nombre: "+alumno.getNombre());
			System.out.println("apellido: "+alumno.getApellido());
			System.out.println();
			System.out.println("******************");
		}
		
		//Obtener un estudiante especifico
		lista_estudiantes.get(0);
		lista_estudiantes.get(0).getNombre();
		
		
		
		
		
		
		
		
	}

}
