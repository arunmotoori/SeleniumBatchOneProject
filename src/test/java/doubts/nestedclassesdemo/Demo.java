package doubts.nestedclassesdemo;

import doubts.nestedclassesdemo.ClassA.ClassB;

public class Demo {

	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		System.out.println(cb.c);
		System.out.println(ClassB.d);
		cb.sampleBOne();
		ClassB.sampleBTwo();
		

	}

}
