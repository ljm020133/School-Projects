package hw1;

public class cityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c = new City("Paris", 75);

		// We should see the values with which we constructed it
		System.out.println(c.getCityName()); // expected "Paris"
		System.out.println(c.hostelCost()); // expected 75
		System.out.println(c.nightsStay(500)); // expected 6
		System.out.println(c.nightsStay(50)); // expected 0
		System.out.println(c.postcardCost()); // expected 4
		System.out.println(c.numPostcards(50)); // expected 12
	}

}
