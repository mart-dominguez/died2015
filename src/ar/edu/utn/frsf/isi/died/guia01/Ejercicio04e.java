package ar.edu.utn.frsf.isi.died.guia01;

/**
 * d) Escriba un método recursivo que reciba como argumento un entero no
 * negativo y lo imprima en binario. En la siguiente figura puede ver un ejemplo
 * de como realizar esta conversión
 * 
 * @author Administrador
 *
 */
public class Ejercicio04e {
	  public void decBin(int n) {
	        if (n < 2) {
	            System.out.print(n);
	            return;
	        } else {
	            decBin(n / 2);
	            System.out.print(n % 2);
	            return;
	        }
	    }
	  
	  public static void main(String[] args) {
		Ejercicio04e ej4d = new Ejercicio04e();
		System.out.println("===");
		ej4d.decBin(7);
		System.out.println("===");
		ej4d.decBin(64);
		System.out.println("===");
		ej4d.decBin(152);
		System.out.println("===");
	}
}
