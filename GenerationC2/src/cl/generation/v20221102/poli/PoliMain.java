package cl.generation.v20221102.poli;

import cl.generation.v20221102.poli.Gato;
import cl.generation.v20221102.poli.Mascotas;
import cl.generation.v20221102.poli.Perro;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo
		//instancia de las clases
		
		Mascotas mascotas= new Mascotas();
		mascotas.emitirSonido();

		
		Perro nur = new Perro();
		nur.emitirSonido();
		
		Gato fito = new Gato();
		fito.emitirSonido();
		
		/*******POLIMORFISMO********/
		/* Una super clase se comporta como una clase hija, pero no es la clase hija.
		 * DEBE EXISTIR HERENCIA
		 * jerarquia de clase
		 * */
		
		System.out.println("");
		Mascotas regalon = new Perro();
		regalon.emitirSonido();
		regalon.setNombre("Zoe");
		System.out.println(regalon.toString());
		
		Mascotas michi = new Gato();
		michi.emitirSonido();
		
/*polimorfismo parametrico, 
 * el metodo se escribe igual pero recibe distintos parametros*/
		michi.horasSiesta(16.5f);
		
		//Perro dog = (Perro) new Mascota();
		Perro dog = (Perro) regalon;
	}

}