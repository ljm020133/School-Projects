package labPractice;
public class Flowchart3 {
	
		public double weight;
		public double cost;
		
		public double flowchart3(){
			if (weight > 1) {
				cost = cost + Math.ceil(weight-1) * 0.21;
			if (weight > 3.5) 
				cost = cost + 0.47;
			
		
			}
			return cost;
		}

	}

