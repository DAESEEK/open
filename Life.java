package seongduck;

import java.util.Scanner;

public class Life {

	public static void main(String[] args) {
	
		System.out.println("Enter work days : ");
		
		Scanner scan = new Scanner(System.in);
		
		int workday = scan.nextInt();
		
		Person.money=workday*Company.payPerDay;
		
		System.out.println(Person.money);
		
		Store.buy();
		
		System.out.println(Store.happyness);
		

	}

}
