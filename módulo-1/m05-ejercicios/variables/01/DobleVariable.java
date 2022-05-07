package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DobleVariable {
	public static void main(String[] args) {

		int numero;
		int elDoble;

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

		elDoble = numero * 2;

		System.out.println("Tu variable es " + numero + " y el doble es " + elDoble);

		esca.close();
	}
}