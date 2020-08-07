package JavaBasicExam;

import java.util.Scanner;

public class DrawStarTreeA {

	public static void main(String[] args) {

		System.out.println("Enter the line number : ");

		Scanner scanner = new Scanner(System.in);

		int countLine = scanner.nextInt();

		for (int i = 0; i <= countLine; i++) {

			for (int j = 0; j < countLine - i; j++) {

				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {

				System.out.print("*");

			}

			System.out.println(" ");

		}

		for (int i = countLine; i >= 0; i--) {
			for (int j = 0; j < countLine - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}
