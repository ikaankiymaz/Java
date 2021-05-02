package oopintrohomework2;

public interface Example1 {

	public static void main(String[] args) {

		findNumber();

	}

	public static void findNumber() {

		/* Example5 - Find Number */

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int enteredNumber = 2;
		boolean state = false;

		for (int i = 0; i < numbers.length; i++) {
			if (enteredNumber == numbers[i]) {
				state = true;
				break;
			}
		}

		if (state == true) {
			giveMessage("The number " + enteredNumber + " entered is included in the numbers group.");
		} else {
			giveMessage("The number " + enteredNumber + " entered isn't included in the numbers group.");
		}
	}

	public static void giveMessage(String message) {

		System.out.println(message);

	}

}
