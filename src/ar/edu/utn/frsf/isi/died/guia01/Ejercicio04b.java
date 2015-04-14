package ar.edu.utn.frsf.isi.died.guia01;

/**
 * b) Escriba un método recursivo tal que devuelva el número de vocales que
 * tiene String. Por ejemplo para el String “algoritmos”, el método vocales
 * (“algoritmos”) retorna el valor 4.
 * 
 * 
 * @author Administrador
 *
 */
public class Ejercicio04b {
 
	public int vocales(String s){
		return vocales(s,s.length()-1);
	}
	
	private int vocales(String s,int l){		
		if(l==0){
			if( esVocal(s.charAt(l))) return 1;
			else return 0;
		}
		
		if(esVocal(s.charAt(l))){
			return 1 + vocales(s,l-1);
		}else{
			return vocales(s,l-1);
		}
		
	}
	
	private boolean esVocal(char c){
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
	
	public static void main (String[] args){
		String test1 ="aytubaeon";
		String test2 ="popbnumba";
		String test3 ="aounmbtie";

		Ejercicio04b ejercicio = new Ejercicio04b();
		System.out.println(ejercicio.vocales(test1));
		System.out.println(ejercicio.vocales(test2));
		System.out.println(ejercicio.vocales(test3));
	}
}
