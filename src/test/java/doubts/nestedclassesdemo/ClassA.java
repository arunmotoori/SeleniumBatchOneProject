package doubts.nestedclassesdemo;

public class ClassA {
	
	int a = 10;
	static int b = 20;
	
	public void sampleAOne() {
		System.out.println("Inside sampleAOne method");
	}
	
	public static void sampleATwo() {
		System.out.println("Inside sampleATwo method");		
	}
	
	static class ClassB{
		
		int c = 30;
		static int d = 40;
		
		public void sampleBOne() {
			System.out.println("Inside sampleBOne method");
			System.out.println(b);
			ClassA ca = new ClassA();
			System.out.println(ca.a);
			ca.sampleAOne();
			sampleATwo();
		}
		
		public static void sampleBTwo() {
			System.out.println("Inside sampleBTwo method");
		}
		
	}
	
	

}
