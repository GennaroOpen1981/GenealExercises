package src;

/**
 * Escribir una clase que contenga 3 métodos estáticos para calcular el area de las siguientes
 * figuras geométricas:
 * 	- Círculo
 *  - Rectángulo
 *  - Cilindro
 *  
 *  Las fórmulas para calcular las areas son las siguientes:
 *  - Area del círculo: A=nr^2  (n representa PI, r el radio del círculo)
 *  - Area del rectangulo: A=b*h
 *  - Area del cilindro: A=nr^2*h (n representa PI, r es el radio de la base del cilindro, h es la altura)
 * @author java
 *
 */
public class Area {

	public static final double PiGreco = 3.141592;

	public static double areaCirculo(double r) {
		return PiGreco * Math.pow(r, 2);
	}

	public static double areaRectangulo(double b,double h) {
		return b*h;
	}

	public static double areaCilindro(double r,double h) {
		return PiGreco * Math.pow(r, 2) * h;
	}

}
