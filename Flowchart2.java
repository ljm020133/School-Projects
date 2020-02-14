package postage2;
public class Flowchart2 {
	
		public double weight;
		public double cost;
		public double flowchart2()
		{
		if (weight <= 1){
	          cost = 0.47;}
			if (weight > 1) {
				cost = 0.47+ Math.ceil(weight-1) * 0.21;
			}
			if (weight > 3.5) {
				cost = 0.94 + Math.ceil(weight - 1) * 0.21;
			}
	            else
	            { cost = 0.47 + Math.ceil(weight - 1) * 0.21;}
		return cost;
		}

	}

 
