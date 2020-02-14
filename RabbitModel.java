package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{
	private int population;
  // TODO - add instance variables as needed
    Random rand;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
  {
	rand = new Random();
	population = 0;
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
	 population += rand.nextInt(11);
    // TODO
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
 * @param <reset>
   */
  public void reset()
  {
	  population = 0;
	  rand = new Random();
    // TODO
  }
}
