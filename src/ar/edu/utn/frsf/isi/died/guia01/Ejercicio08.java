package ar.edu.utn.frsf.isi.died.guia01;

import java.util.Arrays;

public class Ejercicio08 {
/*	public	void algoritmoX (itemType a[], int N, int M) {
		 itemType *b;
		 b = new itemType [N];
		 int *count;
		 count = new int[M];
		 int i, j;
		 for (j = 1; j < M; j++) count [j] = 0;
		 for (i = 1; i <= N; i++) count [a[i]] ++;
		 for (j = 1; j < M; j++) count [j] += count[j - 1];
		 for (i = N; i >= 1; i--) b[count[a[i]] --] = a [i];
		 for (i = 1; i <= N; i++) a[i] = b[i];
		 delete b;
		 delete count;
		}*/
	
	public void algoritmoX(int[] a,int n, int m){
		int[] b = new int[n];
		int[] count = new int[m];
		int i,j;
		 System.out.println("Resultado A--> "+Arrays.toString(a));
		 for (j = 0; j < m; j++) count [j] = 0;
		 for (i = 0; i < n; i++) count [a[i]] ++;
		 System.out.println("Resultado Count--> "+Arrays.toString(count));
		 for (j = 1; j < m; j++) count [j] += count[j - 1];
		 System.out.println("Resultado Count--> "+Arrays.toString(count));
		 for (i = n-1; i > 0; i--) b[count[a[i]]--] = a [i];
		 for (i = 0; i < n; i++) a[i] = b[i];
		 System.out.println("Resultado Count--> "+Arrays.toString(count));
		 System.out.println("Resultado A--> "+Arrays.toString(a));
		 System.out.println("Resultado B--> "+Arrays.toString(b));
	}
	
	public static void main(String[] args){
		Ejercicio08 ej04 = new Ejercicio08();
		 int[] test= {5,4,4,1,2,4,3,1,0,2,1,2,1,4,2};
		 System.out.println(test.length);
		 ej04.algoritmoX(test, test.length, 6);
	}
}
