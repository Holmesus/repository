package concurrent;

import java.awt.Point;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class VarHandleTest {

	volatile int x;
	private Point[] points;

	private static  VarHandle QA;
	private static  VarHandle X;

	static {
		try {
			QA = MethodHandles.arrayElementVarHandle(Point[].class);
			X = MethodHandles.lookup().findVarHandle(Point.class, "x", int.class);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static void main(String[] args) {
		Point point = new Point();
		System.out.println(X.get(point));
	}
}
