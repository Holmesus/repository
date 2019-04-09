package thread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			while (true) {
				System.out.println(System.currentTimeMillis());
				System.out.println(Thread.currentThread().getState());
				System.out.println(Thread.currentThread().isInterrupted());
			}
		});
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
	}
	
}
class A{
	private A a;
	private String bString;
	@Override
	public String toString() {
		return "A [a=" + a + ", bString=" + bString + "]";
	}
	public A(A a, String bString) {
		super();
		this.a = a;
		this.bString = bString;
	}
	
	
}
