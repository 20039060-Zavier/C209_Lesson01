/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * zavie, 21 Apr 2021 2:05:13 pm
 */

package C209_L01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zavie
 *
 */
public class DateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalDate aDate = LocalDate.of(2001, 9, 25);
		System.out.println(aDate);
		System.out.println("day: " + aDate.getDayOfMonth());
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("time: " + currentTime);
		
		LocalTime aTime = LocalTime.of(5, 10, 30);
		System.out.println("time: " + aTime);
		
		System.out.println("second: " + aTime.getSecond());
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDateTime aDateTime = LocalDateTime.of(2010, 11, 28, 16, 56, 30);
		System.out.println(aDateTime);
		
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String d = "20/11/2000";
		LocalDate dateD = LocalDate.parse(d, ft);
		System.out.println(dateD);
		
		DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("G yy MM, d");
		String result = dateD.format(ft2);
		System.out.println(result);
		
	}
}
