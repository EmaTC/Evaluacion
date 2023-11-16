package Evaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Evaluacion {

	static int n1, n2;
	static boolean bandera;

	public static void saludar() {
		System.out.println("Hola, Bienvenido a la Calculadora.");
	}

	public static void ingresarNumeros() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Ingresa un primer numero: ");
			n1 = entrada.nextInt();
			System.out.println("Ingresa un segundo numero: ");
			n2 = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Fallo el ingreso de datos");
		}

	}

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int Resta(int a, int b) {
		return a - b;
	}

	public static int Multiplicacion(int a, int b) {
		return a * b;
	}

	public static int Division(int a, int b) {
		return a / b;
	}

	public static int potencia(int a, int b) {

		int potencia = a * b;

		return potencia;
	}

	public static double raiz_cuadrada(int a) {

		double raiz = Math.pow(a, 0.5);

		return raiz;

	}

	public static boolean vamoAseguir() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nDesea seguir con el programa? (elegir S/N)");
		char respuesta = entrada.next().charAt(0);
		return respuesta == 'N';
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		saludar();

		while (!bandera) {
			System.out.println("Selecciona El resultado de una de estas Operaciones.");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Potencia");
			System.out.println("6. raiz_cuadrada");

			try {
				int opcion = entrada.nextInt();

				switch (opcion) {
				case 1:
					ingresarNumeros();
					System.out.println("El resultado de la suma es: " + sumar(n1, n2));
					bandera = vamoAseguir();
					break;
				case 2:
					ingresarNumeros();
					System.out.println("El resultado de la Resta es: " + Resta(n1, n2));
					bandera = vamoAseguir();
					break;
				case 3:
					ingresarNumeros();
					System.out.println("El resultado de la Multiplicación es: " + Multiplicacion(n1, n2));
					bandera = vamoAseguir();
					break;
				case 4:
					ingresarNumeros();
					System.out.println("El resultado de la División es: " + Division(n1, n2));
					bandera = vamoAseguir();
					break;
				case 5:
					ingresarNumeros();
					System.out.println("El resultado de la potencia es: " + potencia(n1, n2));
					break;

				case 6:
       try {
					ingresarNumeros(); 
					System.out.println("El resultado de la raiz es: " + raiz_cuadrada(n1));
					break;

				 }catch(ArithmeticException ae) {
						System.out.println("Error: Numero Negativo");
						entrada.next();
					}default:
						System.out.println("Opción no válida.");
						break;

				}
			} catch (InputMismatchException e) {
				
				if ( n1  < 0 && n2 <0) {
				System.out.println("Error: Ingresa un número válido.");
				entrada.next();
			}
		}
	}

}}