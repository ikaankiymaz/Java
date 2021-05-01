package intro;

public interface Example5_arrays {
	public static void main(String[] args) {
		
		/****************************************************/
		/* Arrays */

		String student1 = "Kaan";
		String student2 = "Hakan";
		String student3 = "Kutluk";
		String student4 = "Onur";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("----------------");
		
		String[] students = new String[4];
		students[0] = "Kaan";
		students[1] = "Hakan";
		students[2] = "Kutluk";
		students[3] = "Onur";

		for (int i = 0; i < students.length; i++) {		// This output is same as below output.
			System.out.println(students[i]);
		} 
		
		System.out.println("----------------");
		
		for (String student : students) {				// This output is same as above output.
			System.out.println(student);
		} 

		/****************************************************/
		
		
		/****************************************************/
		/* reCapDemo2 */

		//double[] myList = new double[7]; 					// This list is same as below list.
		//myList[0] = 1.3;
		//myList[1] = 14.7;
		//myList[2] = 3.8;
		//myList[3] = 4.1;
		//myList[4] = 5.5;
		//myList[5] = 6.0;
		//myList[6] = 7.2;				
		
		double[] myList = {1.3,14.7,3.8,4.1,5.5,6.0,7.2};	// This list is same as above list.
		double total=0;
		double max = myList[0];
		
		for(double number : myList)
		{
			if(max<number)
			{
				max=number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Total = " + total);
		System.out.println("Big number is " + max + ".");

		/****************************************************/
		
		
		/****************************************************/
		/* Multi Dimentional Array */

		String[][] cities = new String[3][3];
		cities[0][0] = "İstanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Bilecik";
		cities[1][0] = "Ankara";
		cities[1][1] = "Konya";
		cities[1][2] = "Kayseri";
		cities[2][0] = "Diyarbakır";
		cities[2][1] = "Şanlıurfa";
		cities[2][2] = "Gaziantep";

		for (int i = 0; i < 3; i++) {
			System.out.println("-----------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(cities[i][j]);
			}
		}

		/****************************************************/
		
		
	}
}
