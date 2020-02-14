package lab2;
/**
 * Model of a lab for use to calculate atomic mass and atomic charges.
 * @author gigm2
 *
 */
public class Atom {
	/*
	 * Number of Protons.
	 */
	private int Protons;
	/*
	 * Number of Neutrons.
	 */
	private int Neutrons;
	/*
	 * Number of Electrons.
	 */
	private int Electrons;
	/**
	 * 
	 * @param givenProtons
	 * @param givenNeutrons
	 * @param givenElectrons
	 */
public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
{
Protons = givenProtons;
Neutrons=givenNeutrons;
Electrons = givenElectrons;
}

public int getAtomicMass() 
{
int getAtomicMass = Protons+Neutrons;
return getAtomicMass;
}

public int getAtomicCharge()
{
int getAtomicCharge = (Protons - Electrons);
return getAtomicCharge;
}

public void decay()
{
Protons-=2; Neutrons-=2;
}



}
