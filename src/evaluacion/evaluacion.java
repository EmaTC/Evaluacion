package evaluacion;

import java.util.Scanner;

public class evaluacion {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		
		int sanguches_maxima = Integer.MIN_VALUE;
		int sanguches_minima = Integer.MAX_VALUE;
		int suma = 0, promedio = 0;

		int[] sanguches = new int[3];
        
		for (int i = 0; i < 3; i++) 
		
		
		{
			System.out.println("Ingrese la cantidad de los sanguches producidos: ");
			sanguches[i] = datos.nextInt();
			promedio = promedio + sanguches[i];
			if (sanguches[i] > sanguches_maxima) {
				sanguches_maxima = sanguches[i];
				
				
			}

			if (sanguches[i] < sanguches_minima) {
				sanguches_minima = sanguches[i];

			}
		}

		System.out.println("Valor máximo: " + sanguches_maxima);
		System.out.println("Valor mínimo: " + sanguches_minima);
		System.out.println("El promedio es de " + promedio / 3);

		for (int i = 0; i < (sanguches.length - 1); i++) {

			for (int j = 0; j < (sanguches.length - i - 1); j++) {

				if (sanguches[j] > sanguches[j + 1]) {

					int temporal = sanguches[j];

					sanguches[j] = sanguches[j + 1];
					sanguches[j + 1] = temporal;
				}

			}

		}

		System.out.println("ascendente: ");
		for (int m = 0; m < sanguches.length; m++) {
			System.out.println(sanguches[m] + " ");
		}

	}

}
