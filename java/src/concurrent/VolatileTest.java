package concurrent;


public class VolatileTest {

	private static volatile int a=0;
	
	public static void main(String[] args) {
		int c=0;
		while(c<100) {
			c++;
			Runnable run=() -> {
				System.out.println(a++);
			};
			new Thread(run).start();;
		}
	}
}
