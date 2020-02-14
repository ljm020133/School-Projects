package lab2;

public class FitnessTracker {
	private int step;
	private int totalSteps = 0;
	
	public FitnessTracker(int steps) {
		// TODO Auto-generated constructor stub
		steps = step;
	}
	public void addSteps(int step)
	{
		totalSteps = step += totalSteps;
	}
	public int getTotalSteps() {
		return totalSteps;
	}
	public double getCaloriesBurned() {
		double getCarloriesBurned = totalSteps / 20;
		return getCarloriesBurned;
	}
	void reset() {
		totalSteps = 0;
		
	}
	
}
