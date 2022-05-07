package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PotenciaDecimales {
	public static void main(String[] args) {

		double numero;
		double potencia;
		double resultado;

		Scanner esca = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Ingresa un numero decimal: ");
				numero = esca.nextDouble();
				System.out.print("Ingresa otro numero decimal: ");
				potencia = esca.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa unicamente numeros");
				esca.nextLine();
			}
		}

		resultado = calcularPotencia(numero, potencia);

		System.out.println("La potencia de " + numero + " elevado a " + potencia + " es " + resultado);

		esca.close();
	}

	static double calcularPotencia(double numero, double potencia) {
		double respuesta = 1;
		if (numero > 0 && potencia == 0) {
			return respuesta;
		} else if (numero == 0 && potencia >= 1) {
			return 0;
		} else {
			for (int i = 1; i <= potencia; i++) {
				respuesta = respuesta * numero;
			}
			return respuesta;
		}
	}
}
