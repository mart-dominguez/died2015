package ar.edu.utn.frsf.isi.died.guia01;

/**
 * Ejercicio 4 Escriba un algoritmo recursivo para los siguientes problemas e
 * indique - el tipo de recursión que emplea - transforme el algoritmo recursivo
 * en iterativo. a) Encontrar el máximo de un arreglo de enteros.
 * 
 * @author Administrador
 *
 */
public class Ejercicio04a {

	public int buscarMaximo(int[] arreglo){
		return this.buscarMaximo(arreglo,arreglo.length-1);
	}
	
	private int buscarMaximo(int[]arreglo, int n){
		int max=Integer.MIN_VALUE;
		if(n==0) return arreglo[0];
		else{
			max = buscarMaximo(arreglo,n-1);
			return (arreglo[n]>max) ? arreglo[n]:max;
		}
	}
	
	public static void main (String[] args){
		int[] test1 = {3,6,4,1,7};
		int[] test2 = {8,6,4,1,7};
		int[] test3 = {3,6,9,1,7};

		Ejercicio04a ejercicio = new Ejercicio04a();
		System.out.println(ejercicio.buscarMaximo(test1));
		System.out.println(ejercicio.buscarMaximo(test2));
		System.out.println(ejercicio.buscarMaximo(test3));
	}
}
