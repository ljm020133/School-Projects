package postage1;
public class Flowchart1 {
	
	public	double weight;
		public double cost;
		public double flowchart1()
		{
	    
		
		if (weight <= 1){
	          cost = 0.47;}
	            if (weight <= 3.5) {
	                cost = 0.47 + Math.ceil(weight - 1) * 0.21;}
	            else
	            { cost = 0.94 + Math.ceil(weight - 1) * 0.21;}
		return cost;
		}

	}

