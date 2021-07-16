/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * zavie, 21 Apr 2021 11:53:52 am
 */

package C209_L01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zavie
 *
 */
public class FirstSchDay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime firstDayofSch = LocalDateTime.of(2019, 4, 15, 9, 15);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyy, hhmm a");

		System.out.println("The first day of school is on " + firstDayofSch.format(formatter));
	}
}
