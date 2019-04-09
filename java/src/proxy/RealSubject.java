package proxy;

public class RealSubject implements Subject{

	@Override
	public void hello() {
		System.out.println("RealSubject hello");
		
	}

	
}
