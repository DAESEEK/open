package seongduck;

public class Store {

	static double happyness;
	static double cost = 100;

	public static double buy() {
		System.out.println(Person.money);

		do {
			happyness = happyness + 100.0;
			Person.money = Person.money - 20000.0;

		} while (Person.money >= 20000);
		// System.out.println(happyness);

		return happyness;
	}

	//public static void main(String[] args) {
	//	buy();
	//	System.out.println(happyness);
	//	System.out.println(cost);
	

}
