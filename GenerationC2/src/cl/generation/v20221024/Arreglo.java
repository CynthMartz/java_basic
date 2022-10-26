package cl.generation.v20221024;

public class Arreglo {

	public static void main(String[] args) {

	//int [] sinNumeros = {};
	// System.out.println(sinNumeros.length);
	
	
	//crear un array de numeros flotantes de tamaño 6
	//float []numeros = new float[4];
	//agregar 6 elementos al arreglo
	/*numeros[0]= 3;
	numeros[1]= 2;
	numeros[2]= 7;
	numeros[3]= 6;*/
	

	
	//solucion 1
			/*int[] arreInt = new int [100];
			for (int i = 0; i < arreInt.length; i++) {
				arreInt[i]=i;
				System.out.println("Elemento :"+(i+1));
			}
			//solucion 2
			int[] arreInt2 = new int[100];
			for (int i = 1; i < arreInt2.length; i++) {
				arreInt2[i]=i+1;
			}
			
			System.out.println(Arrays.toString(arreInt2));*/
			
			//del 100 al 1
			/*int[] arreInt2 = new int[100];
			for (int i = 0; i < arreInt2.length; i++) {
				arreInt2[i]=i+1;
			}
			System.out.println(Arrays.toString(arreInt2));

			int [] ejercicio3 = new int [100];
			for (int i= 0; i<ejercicio3.length; i++) {
				ejercicio3[i]= 100-i;
			}
			System.out.println(Arrays.toString(ejercicio3));

			int[] arreglo100a1 = new int[100];
			//{100,99,98,97...0}
			for(int i =arreglo100a1.length; i>0  ;i-- ) {
				arreglo100a1[arreglo100a1.length - i]= i;*/
			}
			
			//1,Escribir un arreglo de tamaño de 10 ,con números positivos y negativos ,
			//capturar en máximo y mínimo
			//2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
			///3. Para el mismo arreglo, sacar el promedio de los números.
			
			int arreglito = new int {-3,-5, 4,12, 3,35, -35,77,-1, 0};
			
			int [] arreglo10 = new int [10];
			
			int maximo = arreglito[0]; 
			int minimo = arreglito[0]; 
			for (int i = 0; i < 100; i++){
				if (maximo < arreglo10[i])
					maximo = arreglo10[i];
				if (minimo > arreglo10[i])
					minimo = arreglo10[i];
			}

			// Al finalizar el bucle, las variables contienen los valores máximos y mínimos.
			System.out.println("La máximo de la lista es " + maximo);
			System.out.println("La mínimo de la lista es " + minimo);
			
			int[] arreglo = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
			
			int maxNum = arreglo[0];
			
			for(int i : arreglo) {
				if(i > maxNum)
					maxNum = i;
			}
			System.out.println(maxNum);
	}	
			
			
}
			
	

	