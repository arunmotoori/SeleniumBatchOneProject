package doubts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<>();
		
		ArrayList<Integer> alist2 = (ArrayList<Integer>)alist;
		
		alist2.add(9); // 0
		alist2.add(5); // 1
		alist2.add(7); // 2
		alist2.add(1); // 3
		 
		for(Integer e : alist) {
			
			System.out.println(e);
			
		}
		
	}

}
