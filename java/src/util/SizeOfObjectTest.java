package util;

import concurrent.FalseSharing.VolatileLong;

public class SizeOfObjectTest {

	public static void main(String[] args) throws IllegalAccessException {
//		VolatileLong[] longs = new VolatileLong[10];// 12+4 12+8+4 12
//		VolatileLong volatileLong = new VolatileLong();
//		System.out.println(SizeOfObject.sizeOf(longs));
//		System.out.println(SizeOfObject.sizeOf(volatileLong));
//		Integer[] integers = { 1, 2 };
//		System.out.println(SizeOfObject.sizeOf(integers));
//		System.out.println(SizeOfObject.sizeOf(new Integer[1]));
//		System.out.println(SizeOfObject.sizeOf(new String()));
//		System.out.println(SizeOfObject.sizeOf(new VolatileLong()));
//		System.out.println(SizeOfObject.sizeOf(new String[1]));
//		System.out.println(SizeOfObject.sizeOf(new Integer(1)));
//		System.out.println(SizeOfObject.sizeOf(new A()));
		
		System.out.println(SizeOfObject.sizeOf(new Integer[0]));//12+4 16
		System.out.println(SizeOfObject.sizeOf(new Integer[1]));//12+8+4 24
		System.out.println(SizeOfObject.sizeOf(new Integer[2]));//12+4+4+4 24
		System.out.println(SizeOfObject.sizeOf(new Integer[3]));//12+4*3+4 32
		System.out.println(SizeOfObject.sizeOf(new Integer[4]));//12+4*4+4 32
		System.out.println(SizeOfObject.sizeOf(new Integer[5]));//12+4*5+4 40
		System.out.println(SizeOfObject.sizeOf(new Integer[100]));//12+4*100+4

	}

}
