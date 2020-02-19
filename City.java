package hw1;

public class City {
	public static final double POSTCARD_COST = 0.05;
	private String name;
	private int postageCost;
	private int hostelCost;
	private int numPostcards;
	
	
	public City(String givenCityName, int givenHostelCost) {
		name = givenCityName;
		hostelCost = givenHostelCost;
		
	}
	public String getCityName() {
		return name;
	}
	public int hostelCost() {
		return hostelCost;
	}
	public int postcardCost() {
		postageCost = (int) Math.round(hostelCost*POSTCARD_COST);
		return postageCost;
	}
	public int nightsStay(int moneyAvailable) {
		int nightsStay = moneyAvailable/hostelCost;
		return nightsStay;
	}
	public int numPostcards(int moneyAvailable) {
		if(postageCost != 0 ){
		numPostcards = (moneyAvailable/postageCost);}
		return numPostcards;
	}
	
}

