/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * zavie, 21 Apr 2021 11:42:15 am
 */

package C209_L01;

import java.time.LocalDate;

/**
 * @author zavie
 *
 */
public class MyBirthday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birthdate = LocalDate.of(2001, 9, 25);
		int year = birthdate.getYear();
		System.out.println("I was born in " + year);

		System.out.println("The month I was born in was: " + birthdate.getMonth());

		System.out.println("The day I was born in was: " + birthdate.getDayOfWeek());
	}
}
