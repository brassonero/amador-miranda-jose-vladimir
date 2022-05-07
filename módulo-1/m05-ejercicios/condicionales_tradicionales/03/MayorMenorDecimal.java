package inicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MayorMenorDecimal {
	public static void main(String[] args) {

        double numero;
        
        Scanner esca = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Ingresa un numero decimal: ");
				numero = esca.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa unicamente enteros y decimales");
				esca.nextLine();
			}
		}

		//Solucionar valores muy grandes
		int numeroEntero = (int) numero;
		
		if(numero - numeroEntero > 0.5) {
        	System.out.println("Los decimales de " + numero + " son mayores a 0.5");
        }else if(numero - numeroEntero < 0.5){
        	System.out.println("Los decimales de " + numero + " son menores a 0.5");
        }else {
        	System.out.println("El decimal de " + numero + " es igual a 0.5");
        }

		esca.close();
	}
	
	//Crear metodos
}
