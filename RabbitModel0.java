package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel0
{
	private int population;
  // TODO - add instance variables as needed
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel0()
  {
	population = 2;
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
	 population++;
    // TODO
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
 * @param <reset>
   */
  public void reset()
  {
	  population = 2;
    // TODO
  }
}
