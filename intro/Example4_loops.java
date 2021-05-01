package intro;

public interface Example4_loops {
	public static void main(String[] args) {

		/****************************************************/
		/* For Loop */

		for (int i = 0; i < 10; i++) {
			System.out.println("For loop = " + i);

		}

		System.out.println("Loop's finish.");

		/****************************************************/

		/****************************************************/
		/* While Loop */

		int i = 0;

		while (i < 10) {
			System.out.println("While loop = " + i);
			i++;
		}

		System.out.println("Loop's finish.");

		/****************************************************/

		/****************************************************/
		/* Do-While Loop */
		/* Differents from while loop is this, do-while loop goes into loop even if
		  condition is not met. */

		int j = 0;

		do {
			System.out.println("Do-While loop = " + j);
			j++;
		} while (j < 10);

		System.out.println("Loop's finish.");

		/****************************************************/

	}
}
