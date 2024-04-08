package doubts;

public class ClassA {
	
	int a = 5;
	
	public void sampleA() {
		
		System.out.println("Inside sampleA method");
		
	}

}

class ClassB extends ClassA {
	
	int b = 10;
	
	public void sampleB() {
		
		System.out.println("Inside sampleB method");
		
	}
	
	@Override
	public void sampleA() {
		
		System.out.println("SampleA in ClassB");
	}
	
}
