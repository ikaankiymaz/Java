package intro;

public interface Example1_variables {

	public static void main(String[] args) 
	{
		/****************************************************/
		
		int myNumber = 71;
		short myShort = 7171;
		long myLong = 717171;
		
		double myDouble = 5.23;
		float myFloat = 342.3f;
		
		char myChar = 'i';
		boolean myBoolean = true;
		
		byte myByte = 127;
		String myName = "Your Name and Surname";
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
		System.out.println(myName);
		
		/****************************************************/
		
		/****************************************************/

		 int totalStudents = 10;
		 String message = "Total number of students  = ";

		 char character = 'A';
		 String city = "Ankara";

		 boolean isItCorrect = false;

		 System.out.println("Total number of students  = "+totalStudents);		// This output is same as below output.
		 System.out.println(message+totalStudents);								// This output is same as above output.
		 System.out.println(character);
		 System.out.println(city);
		 System.out.println(isItCorrect);

		/****************************************************/
	}
}
