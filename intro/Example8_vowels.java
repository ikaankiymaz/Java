package intro;

public interface Example8_vowels {
	public static void main(String[] args) {
		
		/****************************************************/

		/* Example2 - Vowels */

		char character = 'i';
		char loop;
		boolean response=false;
		char[] deepVoice = { 'O', '�', 'U', '�', 'o', '�', 'u', '�' };
		char[] thinVoice = { 'A', 'E', 'I', '�', 'a', 'e', '�', 'i' };
		for (int i = 0; i < deepVoice.length; i++) {
			loop=deepVoice[i];
			if(loop==character)
			{
				response = true;
				
			}
		}
		if(response==true)
		{
			System.out.println("The character "+character+" you entered is deep voice.");
		}
		else
		{
			System.out.println("The character "+character+" you entered is thin voice.");
		}

		/****************************************************/
		
		
	}
}
