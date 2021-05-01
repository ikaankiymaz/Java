package intro;

public interface Example9_perfectNumber {
	public static void main(String[] args) {
		
		/****************************************************/

		/* Example3 - Perfect Numbers */

		int number = 8128;
		int total=0;
		
		for (int i = 1; i < number + 1; i++) {
			if ((number % i) == 0) {
				total=total+i;
			}
		}
		total = total-number;
		
		if(total==number) {
			System.out.println("The number "+number+" you entered is perfect number.");
		}
		else {
			System.out.println("The number "+number+" you entered isn't perfect number.");
		}

		/****************************************************/
		
		
	}
}
