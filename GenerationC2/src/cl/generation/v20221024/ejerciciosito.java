package cl.generation.v20221024;

public class ejerciciosito {

	public static void main(String[] args) {

		////1,Escribir un arreglo de tamaño de 10 ,con números positivos y negativos ,
		//capturar en máximo y mínimo
		
		
		int[] arreglo = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		
		int maxNum = arreglo[0];
		
		for(int i : arreglo) {
			if(i > maxNum)
				maxNum = i;
		}
		int minNum = arreglo[0];
		for(int i : arreglo) {
			if(i < minNum)
				minNum = i;
		}
		System.out.println(maxNum);
		System.out.println(minNum);
		
		
		//2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
		
		
		
		
		
		
		
		
		
				///3. Para el mismo arreglo, sacar el promedio de los números.

	}

}
