package inicio;

public class EnfrenteAtras {
	public static void main(String[] args) {

		int[] arreglo = new int[] { 5, 2, 3, 1, 4 };

		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}

		System.out.println();

		for (int i = arreglo.length - 1; i >= 0; i--) {
			System.out.print(arreglo[i] + " ");
		}
	}
}
