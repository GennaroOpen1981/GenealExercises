package src;

public class Exercise {

	/**	 * Realizar los siguientes ejercicios y que se pueden ejecutar para ver los resultados en Arvato.main():
	 * 
	 * Ejercicio 1:  @see Area
	 * Ejercicio 2:  @see CharacterCounter
	 * Ejercicio 3:  @see CombinationGenerator
	 * Ejercicio 4:  @see Palindromo
	 * Ejercicoi 5:  @see PiedraPapelTijeraGame
	 *  
	 * @throws Exception
	 */

	public static void main (String args[]) throws Exception {
		
		double r = 2;
		double h = 3;
		double b = 5;
		System.out.println("Area Cilindro "+ Area.areaCilindro(r, h));
		System.out.println("Area Circulo "+ Area.areaCirculo(r));
		System.out.println("Area Rectangulo "+ Area.areaRectangulo(b, h));
		CharacterCounter.CountC();
		System.out.println(""+Palindromo.istPalindrom());
		
		//CharacterCounter.CountC();
		//CombinationGenerator.CGeneration();
		//PiedraPapelTijeraGame.piedraPapelTijeraGameImpl();

	}
}
