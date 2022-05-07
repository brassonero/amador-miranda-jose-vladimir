package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaDecimales {
	public static void main(String[] args) {

		double numero1;
		double numero2;
		double suma;

		Scanner esca = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Ingresa un numero decimal: ");
				numero1 = esca.nextDouble();
				System.out.print("Ingresa otro numero decimal: ");
				numero2 = esca.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa unicamente n�meros");
				esca.nextLine();
			}
		}

		suma = numero1 + numero2;

		System.out.println("La suma es: " + suma);

		esca.close();
	}
}