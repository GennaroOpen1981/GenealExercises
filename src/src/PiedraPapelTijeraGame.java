package src;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Escribir un programa que permita al usuario jugar al mítico juego de piedra/papel/tijera.
 * El programa tiene que ser sencillo, por ejemplo se puede usar integers para mapear piedra(1), papel(2), tijera(3)
 * 
 * 1. El programa tiene que seleccionar aleatoriamente piedra, papel o tijera cada vez que inicia una partida nueva.
 * 2. El usuario mediante el teclado entrará un texto como strinig: "piedra", "papel", "tijera", en caso de no reconocer el string, se omite y 
 * se vuelve a preguntar por un nuevo string.
 * 
 * 3. Decidir si el usuario o el ordenador ha ganado siguiendo las reglas del juego piedra/papel/tijera.
 * 3.1 Si usuario escoge "piedra" y ordenador "tijera", piedra gana.
 * 3.2 Si el usuario escoge "tijera" y ordenador "papel", tijera gana
 * 3.3 Si el usuario escoge "papel" y ordenador "piedra", papel gana.
 * 3.4. Si ambos escogen lo mismo, se debe jugar de nuevo para determinar el ganador
 * 
 * Para leer texto desde el teclado @see {@link java.util.Scanner}
 * 
 * @author java
 *
 */
public class PiedraPapelTijeraGame {
	public static void piedraPapelTijeraGameImpl(){
		boolean bool = false;
		do {
			int[] intArray = {1, 2, 3}; // 1-piedra, 2- tijera, 3 - papel
			int idx = new Random().nextInt(intArray.length);
			String random = "The Computer has " + (intArray[idx]);
			//System.out.println(random);
			Scanner sc=new Scanner(System.in);  
			System.out.println("\nPiedraPapelTijeraGame - Enter your choise (piedra, tijera, papel):\n");
			String text=sc.next();  
			//sc.close();

			if (text.equals("piedra") && random.contains("2")) {
				System.out.println("You win \n");
				bool = false;}
			else if (text.equals("piedra") && random.contains("3")) {
				System.out.println("You loose \n");
				bool = false;
			}
			else if (text.equals("piedra") && random.contains("1")) {
				System.out.println("We have to play again same seed \n");
				bool = true;
			}

			if (text.equals("tijera") && random.contains("3")) {
				System.out.println("You win \n");
				bool = false;}
			else if (text.equals("tijera") && random.contains("1")) {
				System.out.println("You loose \n");
				bool = false;
			}
			else if (text.equals("tijera") && random.contains("2")) {
				System.out.println("We have to play again same seed \n");
				bool = true;
			}

			if (text.equals("papel") && random.contains("1")) {
				System.out.println("You win \n");
				bool = false;}
			else if (text.equals("papel") && random.contains("2")) {
				System.out.println("You loose \n");
				bool = false;
			}
			else if (text.equals("papel") && random.contains("3")) {
				System.out.println("We have to play again same seed \n");
				bool = true;
			}

			if (!text.equals("piedra") && !text.equals("papel") && !text.equals("tijera")){
				System.out.println("I cannot understand! We have to play again \n");
				bool = true;
			} 

		}while (bool);
	}

}
