package oopintrohomework2;

public class Example3_Main {

	public static void main(String[] args) {
		
		//Reference Type
		Example3_CustomerManager customerManager = new Example3_CustomerManager();
		Example3_CustomerManager customerManager2 = new Example3_CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager2.Add();
		customerManager2.Remove();
		customerManager2.Update();
		
		//Value Type
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);
		
		//Reference Type
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}

}

