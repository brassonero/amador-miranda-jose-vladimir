package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumarUser {
	public static void main(String[] args) {

		Scanner esca = new Scanner(System.in);

		int tamanyo;
		int[] arreglo;
		int sum = 0;

		while (true) {
			try {
				System.out.print("Ingresa el tamanyo del arreglo: ");
				tamanyo = esca.nextInt();
				System.out.println("Ingresa los elementos del arreglo:");
				arreglo = new int[tamanyo];
				break;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa unicamente numeros");
				esca.nextLine();
			}
		}

		for (int i = 0; i < tamanyo; i++) {
			arreglo[i] = esca.nextInt();
			sum += arreglo[i];
		}

		System.out.println("La suma de los elementos del arreglo es: " + sum);

		esca.close();
	}
}
