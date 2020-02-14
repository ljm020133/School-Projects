package lab2;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		
		message = "Hello, world!";
		System.out.println(message);
		
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(0);
		System.out.println(theChar);
		
		String upperCase = message.toUpperCase();
		System.out.println(upperCase);
		
		/*String lowerCase = message.toLowerCase();
		System.out.println(lowerCase);*/
		
		String substring = message.substring(0, 5);
		System.out.println(substring);
		
		String replace = message.replace("o", "*");
		System.out.println(replace);
		
		
}
}