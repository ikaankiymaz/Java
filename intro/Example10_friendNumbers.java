package intro;

public interface Example10_friendNumbers {
	public static void main(String[] args) {
		
		/****************************************************/

		/* Example4 - Friendly numbers */

		int number1 = 220, number2 = 284;
		int total1 = 0, total2 = 0;

		for (int i = 1; i < number1; i++) {
			if ((number1 % i) == 0) {
				total1 = total1 + i;
				//System.out.println(i);
			}
		}
		System.out.println("The sum of positive integer quotient, excluding  number 1th itself, is "+total1);

		for (int j = 1; j < number2; j++) {
			if ((number2 % j) == 0) {
				total2 = total2 + j;
				//System.out.println(j);
			}
		}
		System.out.println("The sum of positive integer quotient, excluding  number 1th itself, is "+total2);
		
		if(total1==number2 && total2==number1)
		{
			System.out.println("The number "+number1+" and "+number2+" you entered is friendly number.");
		}
		else
		{
			System.out.println("The number "+number1+" and "+number2+" you entered isn't friendly number.");
		}
		
		/****************************************************/
		
	}
}
