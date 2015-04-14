package ar.edu.utn.frsf.isi.died.guia01;

/**
 * Un arreglo A contiene n-1 enteros únicos en el intervalo [0, n-1]; esto es
 * hay un número de este intervalo que no está en A. Diseñar un algoritmo para
 * encontrar ese número en el tiempo O(n). Solo se permite usar O(1) espacio
 * adicional además del arreglo A mismo.
 **/
public class Ejercicio05 {
	
	public int encontrarFaltante1(int[] arreglo){
		int faltante = 0;
		int i = 0;
		boolean encontroFaltante = false;
		while(i<=arreglo.length && !encontroFaltante){
			
			int j = 0;
			boolean encontroNumero = false;
			while(j<arreglo.length && !encontroNumero ){
				encontroNumero = arreglo[j] == i;
				j++;
			}
			
			encontroFaltante = !encontroNumero;
			faltante = i;
			i++;
		}
		return faltante;
	}

	public Integer encontrarFaltante2(int[] arreglo){
		int suma = 0;
		for(int i= 0;i<arreglo.length;i++){
			suma += arreglo[i];
		}
		int totalTeorico = (((arreglo.length+1)*(arreglo.length+1) 
	                                                 - arreglo.length)/2);
		return  totalTeorico- suma;
	}

	public static void main(String[] args){
		int[] test1 = {0,1,6,3,4,2};
		int[] test2 = {0,6,5,3,4,2};
		Ejercicio05 ej05 = new Ejercicio05();
		System.out.println("===SOLUCION TRIVIAL===");
		System.out.println(ej05.encontrarFaltante1(test1));
		System.out.println(ej05.encontrarFaltante1(test2));
		System.out.println("===SOLUCION OPTIMA===");
		System.out.println(ej05.encontrarFaltante2(test1));
		System.out.println(ej05.encontrarFaltante2(test2));
	}
}
