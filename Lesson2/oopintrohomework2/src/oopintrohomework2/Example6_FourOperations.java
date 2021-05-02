package oopintrohomework2;

public class Example6_FourOperations {

	public int plus(int number1, int number2) {
		return number1 + number2;
	}

	//If we need to add 3 numbers later.
	//This operation did not fail because the method signatures are different.
	public int plus(int number1, int number2, int number3) {

		return number1 + number2+ number3;
	}

}
