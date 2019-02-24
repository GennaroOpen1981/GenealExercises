package src;

import java.util.Scanner;

/**
 * Escribir un programa que pregunte al usuario de entrar un texto como String y comprobar si es un palíndromo.
 * 
 * Palindromo es una palaba que se lee de la misma manera hacia adelante y hacía atrás. En este programa se considera un 
 * palíndromo sin tener en cuenta el símbolo de punto.
 * 
 * Para leer texto desde el teclado @see {@link java.util.Scanner}
 * 
 * @author java
 *
 */
public class Palindromo {

	    public static boolean istPalindrom(){
	    	
	    	Scanner sc=new Scanner(System.in);  
			System.out.println("Palindrom - Enter your text:\n");  
			String text=sc.nextLine();  
	        
	        char[] ca = text.toCharArray(); 
	        
	        boolean palindrom = false;
	        if(ca.length%2 == 0){
	            for(int i = 0; i < ca.length/2-1; i++){
	                if(ca[i] != ca[ca.length-i-1]){
	                    return false;
	                }else{
	                    palindrom = true;
	                }
	            }
	        }else{
	            for(int i = 0; i < (ca.length-1)/2-1; i++){
	                if(ca[i] != ca[ca.length-i-1]){
	                    return false;
	                }else{
	                    palindrom = true;
	                }
	            }
	        }
	        return palindrom;
	    }
	
}
