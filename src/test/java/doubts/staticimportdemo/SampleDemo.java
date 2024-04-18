package doubts.staticimportdemo;

import java.util.ArrayList;
import static java.util.Collections.*;

public class SampleDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<>();
		
		alist.add(9);
		alist.add(5);
		alist.add(7);
		
		System.out.println(alist);
		
		sort(alist);
		
		System.out.println(alist);
		

	}

}
