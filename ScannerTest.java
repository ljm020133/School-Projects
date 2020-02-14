package labPractice;
import java.util.Scanner;
public class ScannerTest {
	public static void main(String [] args) {
		String theInput = "Huey Louie Dewey Lolipop";
		Scanner in = new Scanner(theInput);
		
		String first = in.next();
		String second = in.next();
		String third = in.next();
		//String fourth = in.next();
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		//System.out.println(fourth);
	}

}
  
