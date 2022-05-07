package inicio;

public class ComplementoNumero {
	public static void main(String[] args) {

		int sum = 1;
		int rest = 99;

		while (rest > 0) {
			System.out.print(sum + " - " + rest + ", ");
			sum++;
			rest--;
		}
		System.out.print("100 - 0");
	}
}
