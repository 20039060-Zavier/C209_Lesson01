package C209_L01;

import java.util.ArrayList;

public class WorldCitiesArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();

		cityList.add("Singapore");
		cityList.add("Kuala Lumpur");
		cityList.add("Seoul");
		cityList.add("Bandung");

		int numberOfCities = cityList.size();

		cityList.set(2, "Taipei");

		cityList.remove(0);

		for (int i = 0; i < cityList.size(); i++) {
			System.out.println(cityList.get(i));
			numberOfCities = cityList.size();
		}
		System.out.println("Number of cities: " + numberOfCities);
	}
}
