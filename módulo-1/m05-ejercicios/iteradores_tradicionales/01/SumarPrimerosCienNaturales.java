package inicio;

//import java.util.stream.IntStream;

public class SumarPrimerosCienNaturales {
	public static void main(String[] args) {

//		System.out.println(IntStream.rangeClosed(1, 100).sum());

		int sum = 1;
		int sumLoop = 0;

		do {
			System.out.print(sum + " + ");
			sum++;
		} while (sum < 100);

		for (int i = 0; i <= 100; i++) {
			sumLoop += i;
		}
		System.out.print("100 = " + sumLoop);
	}
}
