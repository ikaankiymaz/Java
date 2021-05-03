package oopintrohomework4;

public class Main {

	public static void main(String[] args) {
		
		FourOperation fourOperation = new FourOperation();
		
		int result1 = fourOperation.Plus(4, 3);
		int result2 = fourOperation.Multiply(result1, result1);
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
