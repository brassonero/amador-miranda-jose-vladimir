import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiploSieteOCinco {
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

		//Agregar metodo si es multiplo de ambos
		if (multiploSiete(numero)) {
			System.out.println(numero + " es multiplo de 7");
		} else if (multiploCinco(numero)) {
			System.out.println(numero + " es multiplo de 5");
		} else if (numero == 0) {
			System.out.println("El cero es multiplo de todos los numeros");
		} else {
			System.out.println(numero + " no es multiplo de 7 ni 5");
		}

		esca.close();
	}

	static boolean multiploSiete(int numero) {
		if (numero % 7 == 0 && numero != 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean multiploCinco(int numero) {
		if (numero % 5 == 0 && numero != 0) {
			return true;
		} else {
			return false;
		}
	}
}
