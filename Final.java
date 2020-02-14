package postage3;
import java.util.Scanner;

import postage1.PostageUtil;
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Enter weight of post in ounce: ");
		double b = a.nextDouble();

	    System.out.println("Cost of mailing " + b + " ounce of post is "+ PostageUtil.computePostage(b));

	}

}
