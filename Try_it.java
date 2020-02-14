package lab3;
public class Try_it {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a/0);
		/*
		 * error comes up; Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * at lab3.Try_it.main(Try_it.java:7)
		 */
		
		 String b = "Hello, World!";
		 System.out.println(b.charAt(14));
		/*
		 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 14
		 * at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
		 * at java.base/java.lang.String.charAt(String.java:709)
		 * at lab3.Try_it.main(Try_it.java:16)
		 */
		System.out.println(b.substring(0, 0));
		/*
		 * nothing comes up
		 */
		
	}

}
