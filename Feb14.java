package quizReview;
import java.util.Scanner;
public class Feb14 {
			
	public static void main(String[] args) {
		//calculate burrito price which is 5$ and it's delivery fee is 10%, minimum delivery fee is 2.5$
		//if you order burritos more than 12 delivery fee is 0
		//write the code that calculates total cose of burritos
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many burritos?:");
		int howMany = scanner.nextInt();

		if (howMany <= 5) {
		double TotalCost = (howMany*5)+2.5;
		System.out.println("The total cost for burrito is " + TotalCost);
		}

	if (howMany >= 12) {
		double TotalCost = (howMany*5);
		System.out.println("The total cost for burrito is " + TotalCost);
	}
	
	else {
		double TotalCost = (howMany * 5) * 1.1;
		System.out.println("The total cost for burrito is " + TotalCost);
	}
	}
	}	


