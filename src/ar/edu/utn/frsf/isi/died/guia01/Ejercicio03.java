package ar.edu.utn.frsf.isi.died.guia01.ej03;

import java.util.Arrays;

/**
 * Suponga que cada renglón de un arreglo A de NxN posee valores 1 y 0 
 * de tal modo que en cualquier renglón de A todos los 1 van antes de que los 0.
 * 
 * Escribir un método para determinar la fila que tiene mayor cantidad de 1.
 * @author Administrador
 *
 */
public class Ejercicio03 {

	private int[][] matriz;
	
	
	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int filaMasUnos(){
		int maxCantUnos = 0;
		int filaConMasUnos = 0;
		for(int i=0;i<matriz.length;i++){
			int cantUnosActual = 0;
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]==1) cantUnosActual++;
				else break;
			}
			if(cantUnosActual>maxCantUnos) {
				maxCantUnos = cantUnosActual;
				filaConMasUnos = i;
			}			
		}
		return filaConMasUnos;
	}
	
	public int filaMasUnosOptimizado(){
		int filaConMasUnos = 0;
		int filaActual = 0;
		int col=0;
		while(col<this.matriz[filaActual].length){
			if(this.matriz[filaActual][col]==1){ 
				col++;
				filaConMasUnos = filaActual;
			}
			else{
				filaActual++;
			}
		}
		return filaConMasUnos;
	}
	
	public static void main(String args[]){
		int[][] test = new int[5][5];
		//fila 1
		test[0][0]=1;
		test[0][1]=1;
		// fila 2
		test[1][0]=1;
		test[1][1]=1;
		test[1][2]=1;
		// fila 3
		test[2][0]=1;
		test[2][1]=1;
		test[2][2]=1;
		// fila 4
		test[3][0]=1;
		test[3][1]=1;
		// fila 5
		test[4][0]=1;
		test[4][1]=1;
		test[4][2]=1;
		test[4][3]=1;
		test[4][4]=1;
		
		System.out.println(Arrays.toString(test));

		Ejercicio03 ej3 = new Ejercicio03();
		ej3.setMatriz(test);
		System.out.println(ej3.filaMasUnos());
		System.out.println(ej3.filaMasUnosOptimizado());
	}
}
