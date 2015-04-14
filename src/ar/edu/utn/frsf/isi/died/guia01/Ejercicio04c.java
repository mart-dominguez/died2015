package ar.edu.utn.frsf.isi.died.guia01;

/**
 * c) Un pal�ndromo es una palabra que se escribe exactamente igual le�da en un
 * sentido o en el contrario. Por ejemplo �abba� o �zxyxz� es un pal�ndromo.
 * Escriba un algoritmo que permita determinar si una palabra es pal�ndromo.
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
