package doubts;

public class SampleA {
	
	static int a = 5;
	int b = 15;

	public static void main(String[] args) {
		
		int a = 10;
		int b = 25;
		
		System.out.println(a);
		System.out.println(SampleA.a);
		
		sampleOne();
		
		SampleA sa = new SampleA();
		sa.sampleTwo();
		System.out.println(b);
		System.out.println(sa.b);

	}
	
	public static void sampleOne() {
		
		System.out.println("Inside sampleOne");
		
	}
	
	public void sampleTwo() {
		
		System.out.println("Inside sampleTwo");
		
	}

}
