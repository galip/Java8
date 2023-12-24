package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
	public static void main(String args[]) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDate localDate1 = LocalDate.of(2023, 12, 30);
		System.out.println(localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2023, 365);
		System.out.println(localDate2);
		
		System.out.println("getMonth: " + localDate.getMonth());
		System.out.println("getMonthValue: " + localDate.getMonthValue());
		System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
		System.out.println("getDayOfYear: " + localDate.getDayOfYear());
		System.out.println("Day of month using get: " + localDate.get(ChronoField.DAY_OF_MONTH));
		
		
		System.out.println("plusDays: " + localDate.plusDays(5));
		System.out.println("withYear: " + localDate.withYear(2024));
		System.out.println("with ChronoField: " + localDate.with(ChronoField.YEAR, 2024));
		System.out.println("with TemporalAdjusters: " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println("leapYear: " + localDate.isLeapYear());
		
		System.out.println("isSupported: " + localDate.isSupported(ChronoUnit.YEARS));
	}
}