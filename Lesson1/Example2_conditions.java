package intro;

public class Example2_conditions {

	public static void main(String[] args) {

		/****************************************************/

		int number = 20;

		if (number < 20) {
			System.out.println("Number is less than 20.");
		} else if (number == 20) {
			System.out.println("Number equals 20.");
		} else {
			System.out.println("Number is more than 20.");
		}

		/****************************************************/

		/****************************************************/
		/* The algoritm that finds the biggest of 3 numbers */

		int comparison = 0;

//		int[] values;
//		values = new int[5];
//		values[0] = 10;
//		values[1] = 200;
//		values[2] = 30;
//		values[3] = 40;
//		values[4] = 50;

		int[] values = { 10, 200, 30, 40, 50 }; // This output same as above output.

		for (int i = 0; i < values.length; i++) {
			if (values[i] > comparison) {
				comparison = values[i];
			}
		}
		System.out.println("The biggest number is of " + comparison + ".");

		/****************************************************/
		

	}

}
