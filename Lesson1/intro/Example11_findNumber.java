package intro;

public interface Example11_findNumber {
	public static void main(String[] args) {
		
		
		/****************************************************/

		/* Example5 - Find Number */

		int[] numbers = new int [] {1,2,5,7,9,0};
		int enteredNumber = 3;
		boolean state = false;
		
		for(int i = 0; i< numbers.length; i++)
		{
			if(enteredNumber==numbers[i])
			{
				state=true;
				break;
			}
		}
		
		if(state == true)
		{
			System.out.println("The number "+enteredNumber+" entered is included in the numbers group.");
		}
		else {
			System.out.println("The number "+enteredNumber+" entered is not included in the numbers group.");
		}
		
		/****************************************************/
		
	}
}
