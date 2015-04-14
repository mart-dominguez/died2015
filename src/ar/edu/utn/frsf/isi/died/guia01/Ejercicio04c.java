package ar.edu.utn.frsf.isi.died.guia01;

/**
 * c) Un palíndromo es una palabra que se escribe exactamente igual leída en un
 * sentido o en el contrario. Por ejemplo “abba” o “zxyxz” es un palíndromo.
 * Escriba un algoritmo que permita determinar si una palabra es palíndromo.
 * 
 * @author Administrador
 *
 */
public class Ejercicio04c {

	public boolean esPalindromo(String s){
        if(s.length() == 0 || s.length() == 1) return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
        	return esPalindromo(s.substring(1, s.length()-1));
        return false;		
	}
}
