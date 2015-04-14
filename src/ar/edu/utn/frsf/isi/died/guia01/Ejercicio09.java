package ar.edu.utn.frsf.isi.died.guia01;

import java.util.Arrays;

/**
 * pancake sort
 * http://www.geeksforgeeks.org/pancake-sorting/
 * 
 * https://cgi.csc.liv.ac.uk/~martin/teaching/comp202/Java/Pancakes-code.html
 * @author Administrador
 *
 */
public class Ejercicio09 {
	 int[] arreglo;

	   private void flip(int n) {
	      for (int i = 0; i < n / 2; i++) {
	         int tmp = arreglo[i];
	         arreglo[i] = arreglo[n-i-1];
	         arreglo[n-i-1] = tmp;
	      }      
	   }
	 
	 
	   public void sort() {
		   this.sort(this.arreglo.length);
	   }
	 
	   public void sort(int n) {
		   if(n==0) return;
		   int aux = findPosMax(n);
		   System.out.println("POS MAX"+aux);
		   flip(aux+1);
		   System.out.println(Arrays.toString(this.arreglo));
		   flip(n);
		   System.out.println(Arrays.toString(this.arreglo));
		   sort(n-1);
	   }

	   /**
	    * Busco la posicion del maximo elemento.
	    * @return
	    */
	   private int findPosMax(int fin){
		   int posMax=0;
		   int max= this.arreglo[0];
		   for(int i=0;i<fin;i++){
			   if(this.arreglo[i]>max){
				   max = this.arreglo[i];
				   posMax = i;
			   }
		   }
		   return posMax;
	   }
	   
	   
	 
	   public static void main(String[] args) {
	      int[] test = {1,4,5,2,3};
	      System.out.println("TEST::: "+Arrays.toString(test));
	      Ejercicio09 pancakes = new Ejercicio09();
	      pancakes.arreglo = test;
	      pancakes.sort();
	      System.out.println(Arrays.toString(pancakes.arreglo));
	   }
}
