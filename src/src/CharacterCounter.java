package src;

import java.util.Scanner;

/**
 * Escribir una clase que pregunte al usuario de entrar un texto como String y seguidamente
 * que pregunte de entrar un carácter.
 * 
 * El programa deberá realizar un count de cuantas veces aparece el carácter en el primer texto
 * introducido como String
 * 
 * Para leer texto desde el teclado @see {@link java.util.Scanner}
 * 
 * 
 * @author java
 *
 */
public class CharacterCounter {
	public static int CountC() {

		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter your text:\n");  
		String text=sc.nextLine();  
		System.out.println("Enter your Character:\n"); 
		char c = sc.next().charAt(0);
		sc.close();

		int count = 0;
		text = text.replaceAll("\\s","");
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				count++;
			}
		}
		//System.out.println(""+count);
		return count;
	}



}
