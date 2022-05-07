package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VariablePar {
	public static void main(String[] args) {

		int numero;

		Scanner esca = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Ingresa un numero entero: ");
				numero = esca.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa unicamente numeros enteros");
				esca.nextLine();
			}
		}

		if (esPar(numero)) {
			System.out.println(numero + " es par");
		} else if (numero == 0) {
			System.out.println("El cero es par");
		} else {
			System.out.println(numero + " no es par");
		}

		esca.close();
	}

	static boolean esPar(int numero) {
		return numero % 2 == 0 && numero != 0;
	}
}
