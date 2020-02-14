package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel4
{
	private int population;
	private int lastYear;
	private int yearBefore;
	
  // TODO - add instance variables as needed
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel4()
  {
	lastYear = 1;
	yearBefore = 0;
	population = yearBefore + lastYear;
    // TODO
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
	  
    // TODO - returns a dummy value so code will compile
	return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	 yearBefore = lastYear;
	 lastYear = population;
	 population = yearBefore + lastYear;
	 
    // TODO
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
 * @param <reset>
   */
  public void reset()
  {
	lastYear = 1;
	yearBefore = 0;
	population = yearBefore + lastYear;
    // TODO
  }
}
