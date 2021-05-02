package oopintrohomework2;

public interface Example2 {
	
	public static void main(String[] args) {
		
		String message = "Bugün hava çok güzel.";
		String newMessage = giveCity();
		int number = add(5,7);
		int total = add2(2,3,4,5,6,7,9,15,31);
		System.out.println(newMessage);
		System.out.println(number);
		System.out.println(total);
	}
	
	public static int add(int number1,int number2) {

		return number1+number2;
		
	}
	
	// Variable arguments
	public static int add2(int... numbers) {
		
		int total=0;
		for(int number : numbers) {
			total+=number;
		}
		
		return total;
		
	}
	
	public static void delete() {

		System.out.println("Silindi.");
		
	}
	
	public static void update() {

		System.out.println("Güncellendi.");

	}
	
	public static String giveCity() {
		
		return "Ankara";
		
	}
	
	

}
