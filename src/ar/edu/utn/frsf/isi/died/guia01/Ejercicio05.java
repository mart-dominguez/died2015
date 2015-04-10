package ar.edu.utn.frsf.isi.died.guia01;

import java.util.Arrays;

/**
 * 
 Un elemento mayoritario en un vector A, de tamaño N, es un elemento que
 * aparece más de N/2 veces (en consecuencia habrá como máximo un elemento
 * mayoritario, pudiendo no haber). Por ejemplo: - {3,3,4,2,4,4,2,4,4} 4 es el
 * elemento mayoritario (5 apariciones > 9/2 = V ) - {3,3,4,2,4,4,2,4} No hay
 * elemento mayoritario (4 apariciones de 4 > 8/2 =F ) - Escriba un algoritmo
 * para encontrar el elemento mayoritario cuando exista, o que indique que no
 * existe. - Indique cual es el tiempo de ejecución del algoritmo que construyó
 * 
 * @author Administrador
 *
 */
public class Ejercicio05 {

	public int buscarMayoritario1(int[] arreglo){		
		// por cada elemento del arreglo guardo cuantas ocurrencias tiene.
		int maximo = 0;
		int ocurrenciasMaximo=0;
		for(int i=0;i<arreglo.length;i++){
			int actual =arreglo[i];
			int ocurrenciasActual = 0;
			// analizar cuantas ocurrencias tiene en el arreglo
			for(int j=0;j<arreglo.length;j++){
				if(arreglo[j]==actual){
					ocurrenciasActual++;
				}
			}
			if(ocurrenciasActual>ocurrenciasMaximo){
				ocurrenciasMaximo= ocurrenciasActual;
				maximo = actual;
			}			
		}
		if(ocurrenciasMaximo >arreglo.length/2){
			return maximo;
		}else{
			return -1;
		}
	}

	
	
	public int buscarMayoritario2(int[] arreglo) {
		Arrays.sort(arreglo);
		int mayoritario = arreglo[0];
		int cantidad = 1;
		for (int i = 1; i < arreglo.length; i++) {
			if (mayoritario == arreglo[i])
				cantidad++;
			else {
				if (cantidad > arreglo.length / 2)
					return mayoritario;
				mayoritario = arreglo[i];
				cantidad = 1;
			}
		}
		if (cantidad > arreglo.length / 2)
			return mayoritario;
		else
			return -1;
	}

	public static void main(String[] args) {
		Ejercicio05 ej05 = new Ejercicio05();
		int[] test = { 2,1,2,2,1,1,2,1,2};
		System.out.println("LONG " + test.length);
		System.out.println(ej05.buscarMayoritario1(test));
		System.out.println(ej05.buscarMayoritario2(test));
	}
	
	
}

