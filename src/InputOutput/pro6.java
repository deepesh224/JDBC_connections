package InputOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class pro6 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.withDayOfMonth(6));
		
		
		LocalDate ld1 = LocalDate.of(2004, 05, 24);
		System.out.println(ld1);
		System.out.println(ld1.isBefore(ld));
		System.out.println(ld1);
		
		LocalTime lt =LocalTime.now();
		System.out.println(lt.getMinute());
		System.out.println(lt.getNano());
		
		LocalTime lt1 = LocalTime.of(3, 24);
		System.out.println(lt1.isAfter(lt));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldt1 = LocalDateTime.of(ld1, lt1);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:MM");
		System.out.println(dtf.format(ldt1));
	}
}
