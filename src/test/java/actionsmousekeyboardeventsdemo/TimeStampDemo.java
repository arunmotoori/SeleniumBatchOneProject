package actionsmousekeyboardeventsdemo;

import java.util.Date;

public class TimeStampDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		String newEmail = date.toString().replace(" ","_").replace(":","_").concat("@gmail.com");
		System.out.println(newEmail);

	}

}
