package inicio;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CambiarPosicionYValor {
	public static void main(String[] args) {

		Scanner esca = new Scanner(System.in);

		int tamanyo;
		int[] arreglo;

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
		}

		System.out.println("El arreglo es: " + Arrays.toString(arreglo));

		while (true) {
			try {
				System.out.print("Escoge una posicion: ");
				int posicion1 = esca.nextInt();

				System.out.print("Escoge otro valor de la posicion anterior: ");
				int numero1 = esca.nextInt();
				arreglo[posicion1] = numero1;

				System.out.print("Escoge una nueva posicion: ");
				int posicion2 = esca.nextInt();

				System.out.print("Escoge otro valor la nueva posicion: ");
				int numero2 = esca.nextInt();
				arreglo[posicion2] = numero2;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa unicamente numeros");
				esca.nextLine();
			}
			System.out.println("El arreglo es: " + Arrays.toString(arreglo));
			break;
		}
		esca.close();
	}
}
