package intro;

public interface Example6_strings {
	public static void main(String[] args) {

		/* Strings */

		String message = "Weather is very good today.";
		System.out.println(message);

		System.out.println("Number of elements : " + message.length());
		System.out.println("5th element : " + message.charAt(4));
		System.out.println(message.concat(" Yaþasýn!"));
		System.out.println(message.startsWith("W"));
		System.out.println(message.endsWith("B"));
		
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}
		
		System.out.println(message.indexOf("ç"));
		System.out.println(message.lastIndexOf("ç"));

		String newMesaj = message.replace('ü', 'u');
		newMesaj = newMesaj.replace('ç', 'c');
		newMesaj = newMesaj.replace(' ', '-');
		System.out.println(newMesaj);
		
		System.out.println(message.substring(2));
		System.out.println(message.substring(2,9));
		
		for(String word : message.split(" "))
		{
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());					
		
		System.out.println(message.trim()); 						//This command removes leading and trailing spaces.

		/****************************************************/
		
		
	}
}
