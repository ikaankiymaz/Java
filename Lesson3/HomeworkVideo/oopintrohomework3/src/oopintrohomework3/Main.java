package oopintrohomework3;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//Claslar referans tipdir. Bellekte onu olusturmus oluruz.
		//Bellekte 2 tane alan var, biri stack digeri heapt�r.
		//Customer Manager'i olusturdu�umuz zaman;
		//Stack'de onu tan�mlam�s oluruz. new dedigimiz zaman,
		//Customer Managerin karsiliginda Heap'ta Customer Manager
		//Nesnesi olusturmu� oluruz. 
		
//		int number1 = 10;
//		int number2 = 20;
//		number2 = number1;
//		number1 = 3;
//		System.out.println(number2);
//		
//		int[] numbers1 = new int[] {1,2,3,4};
//		int[] numbers2 = new int[] {5,6,7,8};
//		numbers2 = numbers1;
//		numbers1[0]=10;
//		System.out.println(numbers2[0]);
		
		
		
	}

}

