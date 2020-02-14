package lab2;

public class FitnessTrackerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitnessTracker a;
		a = new FitnessTracker(200);
		a.addSteps(200);
		System.out.println(a.getTotalSteps());
		System.out.println(a.getCaloriesBurned());
		a.reset();
		a.addSteps(30);
		System.out.println(a.getTotalSteps());
		System.out.println(a.getCaloriesBurned());
	}

}
