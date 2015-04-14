package ar.edu.utn.frsf.isi.died.guia01;

import java.util.Arrays;
 
public class Ejercicio08 {
	
	int[] algoritmoX(int[] a, int m1,int m2) {
		int k = m2-m1+1;
        int c[] = new int[k];
        for (int i = 0; i < a.length; i++)
            c[a[i]]++;
        for (int i = 1; i < k; i++)
            c[i] += c[i-1];
        int b[] = new int[a.length];
        for (int i = a.length-1; i >= 0; i--)
            b[--c[a[i]]] = a[i];
        return b;
    }
	
	public static void main(String[] args){
		Ejercicio08 ej04 = new Ejercicio08();
		 int[] test= {5,4,4,3,0,4,3,5,9,2,5,1,8,4,1};
		 System.out.println(test.length);
		 Ejercicio04a minMax = new Ejercicio04a();
		 System.out.println(Arrays.toString(ej04.algoritmoX(test,minMax.buscarMinimo(test),minMax.buscarMaximo(test))));
	}
}
