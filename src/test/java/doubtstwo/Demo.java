package doubtstwo;

public class Demo {

	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		
		System.out.println(ca.a);
		System.out.println(ca.aI);
		System.out.println(ca.bI);
		
		InterfaceA iAI = new ClassA();
		System.out.println(iAI.aI);
		
		InterfaceB iBI = (InterfaceB)iAI;
		System.out.println(iBI.bI);
		
		ClassA caa = new ClassA();
		
		InterfaceB ibb = caa;
	}

}
