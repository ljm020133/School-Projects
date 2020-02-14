package labPractice;
import java.util.Scanner;
public class Multipler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int first = scanner.nextInt();
		System.out.print("Enter a number: ");
		int second = scanner.nextInt();
		int result = first*second;
		System.out.println(first +" times " + second + " is " + result);
	}

}
 
