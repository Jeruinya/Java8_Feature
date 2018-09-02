package java8.timeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class JavadateTimeTest {
	
	public static void main(String[] args){
		
		//for local current time 
		LocalTime time = LocalTime.now();
		System.out.println("Local current time:"+time);
		//for local current date
		LocalDate date = LocalDate.now();
		System.out.println("Local current date:"+date);
		//for current date and time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Local Current Date and time:"+dt);
		
		
		//for any specific date and time
		LocalDateTime dt1 =LocalDateTime.of(1990,Month.JANUARY,01,12,45);
		System.out.println("Specific date and time:"+dt1);

		System.out.println("Afetr 6 Month:"+dt.plusMonths(6));
		System.out.println("Afetr 6 Month:"+dt.minusMonths(12));
		//Usage of period
		LocalDate birthDate = LocalDate.of(1990,01,01);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDate, today);
		System.out.printf("Your age is %d years %d months and %d Days",p.getYears(),p.getMonths(),p.getDays());
		System.out.println(p.getYears()+"-"+p.getMonths()+"-"+p.getDays());
		//ZoneId class to represent zone
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		//specific zone
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt2 = ZonedDateTime.now(la);
		System.out.println(dt2);

	}

}
