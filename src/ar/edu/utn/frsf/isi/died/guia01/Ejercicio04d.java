package ar.edu.utn.frsf.isi.died.guia01;

/**
 * MCD
 *
 */
public class Ejercicio04d {
	public int mcd(int x, int y){
	    if(y==0)
	        return x;
	    else
	        return mcd(y, x%y);
	}
	  
	  public static void main(String[] args) {
		Ejercicio04d ej4d = new Ejercicio04d();
		System.out.println("==="+ej4d.mcd(28,16));
		System.out.println("==="+ej4d.mcd(148,32));
		System.out.println("==="+ej4d.mcd(96,33));		
	  }
}
