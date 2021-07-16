/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * zavie, 21 Apr 2021 12:13:28 pm
 */

package C209_L01;

/**
 * @author zavie
 *
 */
public class Country {
	public String name;
	public double averageYearlyTempC;
	public String thingsToDo;

	/**
	 * @param name
	 * @param averageYearlyTempC
	 * @param thingsToDo
	 */
	public Country(String name, double averageYearlyTempC, String thingsToDo) {
		this.name = name;
		this.averageYearlyTempC = averageYearlyTempC;
		this.thingsToDo = thingsToDo;
	}

	public void display() {
		System.out.println(name);
	}
}
