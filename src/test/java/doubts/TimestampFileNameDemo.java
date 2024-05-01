package doubts;

import java.util.Date;

public class TimestampFileNameDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		String file = date.toString().replace(" ","_").replace(":","_").concat(".png");
		System.out.println(file);
	}

}
