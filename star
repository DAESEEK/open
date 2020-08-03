import java.util.Scanner;

public class DrawStar {

	static int starCount;
	static String a = "*";

	public static void main(String[] args) {

		System.out.println("How many lines do you want to draw?");

		Scanner scanner = new Scanner(System.in);

		starCount = scanner.nextInt();

		for (int i = 0; i < starCount + 1; ++i) {

			for (int j = 0; j < i; j++) {

				if (j % 2 == 0) {

					for (int l = 0; l < j + 1; l++) {

						System.out.printf(a);

					}
					System.out.println(" ");
				}

			}

		}

		/*
		 * 
		 * for (int i = starCount; i > -1; --i) {
		 * 
		 * System.out.printf(a);
		 * 
		 * int k = i;
		 * 
		 * for (int j = 0; j < k; j++) {
		 * 
		 * System.out.printf(a); } System.out.println(" ");
		 * 
		 * }
		 */

	}

}
