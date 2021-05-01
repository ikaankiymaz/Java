package intro;

public interface Example3_switchCase {
	public static void main(String[] args) {

		/****************************************************/
		/* Switch-Case */
		/* The algorithm that send a message by your score */

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Perfect, yo're very succesfull.");
			break;
		case 'B':
		case 'C':
			System.out.println("Good, yo're succesfull.");
			break;
		case 'D':
			System.out.println("Not bad, you passed lesson.");
			break;
		case 'F':
			System.out.println("Unfortunately, you failed lesson.");
			break;
		default:
			System.out.println("Please enter a valid grade");
		}

		/****************************************************/

	}

}
