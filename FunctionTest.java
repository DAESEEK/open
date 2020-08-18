package seongduck;

import java.util.Scanner;

public class FunctionTest {

	static double add(double n1, double n2) {

		double addResult = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + addResult);
		return addResult;
	}

	static double sub(double n1, double n2) {

		double subResult = n1 - n2;

		System.out.println(n1 + "-" + n2 + "=" + subResult);

		return 0;
	}

	static double mux(double n1, double n2) {

		double muxResult = n1 * n2;

		System.out.println(n1 + "*" + n2 + "=" + muxResult);

		return 0;
	}

	static double div(double n1, double n2) {

		double divResult = n1 / n2;

		System.out.println(n1 + "/" + n2 + "=" + divResult);

		return 0;
	}

	public static void main(String[] args) {

		System.out.print("Enter the number : ");

		Scanner scan = new Scanner(System.in);

		double num1 = scan.nextDouble();

		System.out.print("Enter the number again : ");

		Scanner scan1 = new Scanner(System.in);

		double num2 = scan1.nextDouble();

		System.out.print("what will you do? (+,-,*,/ ): ");

		Scanner scan2 = new Scanner(System.in);

		String cal = scan2.next();

		System.out.println(cal);
		
		if (cal.contentEquals("+")) {
			add(num1, num2);
		} else if (cal.contentEquals("-")) {

			sub(num1, num2);
			
		} else if (cal.contentEquals("*")) {

			mux(num1, num2);
		} else {

			div(num1, num2);
		}

	}

}
