package doubts.datedemopack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOneDemo {

	public static void main(String[] args) {
		
		/*
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		*/
		
		// LocalDate, LocalDateTime, LocalTime
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String ldtformatted = ldt.format(dtf);
		System.out.println(ldtformatted);
		
//		Date date = new Date();
//		System.out.println(date);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//		String formattedDate = sdf.format(date);
//		System.out.println(formattedDate);

	}

}
