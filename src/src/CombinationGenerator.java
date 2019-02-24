package src;

import java.util.Arrays;
/**
 * El problema: Escribir un programa que comience con un <Set> de enteros positivos: 1,2,3...N. Lo llamaremos set A
 * Tendremos otra variable n, que será el tamaño, los valores serán 1 <= n <=N
 * 
 * La salida deberá generar todos los posibles subsets únicos de A de n elementos.
 * 
 * Ejemplo:
 * Set a= [1,2,3,4]
 * n=3
 * Output Set x = [[1,2,3],[1,2,4],[1,3,4],[2,3,4]]
 * 
 * 
 * 
 * @author java
 *
 */
//No terminado

public class CombinationGenerator {

	private static long binomial(int n, int k)
	{
		if (k>n-k)
			k=n-k;

		long b=1;
		for (int i=1, m=n; i<=k; i++, m--)
			b=b*m/i;
		return b;
	}
	public static int CGeneration() {

		int[] a = {4,2,1,3};
		int n = 3;
		int [][] out = {};

		Arrays.sort(a);

		long bin = binomial(a.length,n);

		for (int i =0; i<n;i++) {
			for (int j = 0; j<bin; j++) {
				out[j][i]=a[i];
				
			}

		}

		return n;


	}


}
