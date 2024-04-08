package doubts;

public class DemoPC {

	public static void main(String[] args) {
		
		//No downcasting or no upcasting here
		ClassB cb = new ClassB();
		System.out.println(cb.b);
		cb.sampleB();
		System.out.println(cb.a);
		cb.sampleA();
		
		//No downcasting or no upcasting here
		ClassA ca = new ClassA();
		System.out.println(ca.a);
		ca.sampleA();
		
		//Upcasting
		ClassA caa = new ClassB();
		System.out.println(caa.a);
		caa.sampleA();
		
		//Downcasting
		ClassB cbb = (ClassB)caa;
		System.out.println(cbb.a);
		System.out.println(cbb.b);
		cbb.sampleA();
		cbb.sampleB();
		
		//The below line is not possible
		//ClassB cbbb = (ClassB)new ClassA();
		
		

	}

}
