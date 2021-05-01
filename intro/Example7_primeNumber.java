package intro;

public interface Example7_primeNumber {
	public static void main(String[] args) {

		/* Example1 - Prime Number */

		int number = 10;
		int a = 0;
		for (int i = 1; i < number + 1; i++) {
			if ((number % i) == 0) {
				a++;
			}
		}
		if (number < 0) {
			System.out.println("Please enter a positive number.");
		} else if (a == 2) {
			System.out.println("The number " + number + " you entered is prime.");
		} else {
			System.out.println("The number " + number + " you entered isn't prime.");
		}

		/****************************************************/

	}
}
