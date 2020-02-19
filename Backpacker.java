package hw1;

public class Backpacker {
public static final int SYMPATHY_FACTOR = 30;
/*
 *Proportionality constant when calling home for more money: the amount of money received is
 *this constant multiplied by the number of postcards the Backpacker has sent home (since the
 *last time she called home for money).
 */
private int Fund;
private String CityName;
private String journal;
private int postcardCost;
private int postcard;
private int station;

public Backpacker(int initialFunds, City initialCity) {
	Fund = initialFunds;
	CityName = initialCity.getCityName();
	journal = CityName +"(start)";
	postcard = 0;
	postcardCost = (initialCity.postcardCost());
}
public String getCurrentCity() {
	return CityName;
}
public int getCurrentMoney() {
	return Fund;
}
public String getJournal() {
	return journal;
}
public boolean isSOL() {
	if (getCurrentMoney() < postcardCost) {
		boolean isSOL = true;
		return isSOL;
	}
	else {
		boolean isSOL = false;
		return isSOL;
	}
}
public int getNightsInStation() { //need to fix
	return station;
}
public void visit(City c, int numNights) {
	CityName = c.getCityName();
	postcardCost = (c.postcardCost());
	journal = journal+","+c.getCityName() +"(" +numNights +")";
	if((Fund - ((c.hostelCost())*numNights)) > 0) {
	Fund = Fund - ((c.hostelCost())*numNights);}
	else {
		station = station + (numNights - (Fund/(c.hostelCost())));
		Fund = Fund - (Fund/((c.hostelCost()))*(c.hostelCost()));
		 //need to fix
	}
	
}
public void sendPostcardsHome(int howMany) {
	
	if ((Fund - (postcardCost*howMany))>0) {
		Fund = Fund - (postcardCost*howMany);
		postcard = postcard + howMany;
	}
	else {
		postcard = postcard + Math.round(Fund/postcardCost);
		Fund = (Fund - (postcardCost*(Fund/postcardCost)));
		
	}
}
public void callHomeForMoney() {
	Fund = Fund + (SYMPATHY_FACTOR*postcard);
	postcard = 0;
}

}
