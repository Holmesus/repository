package offer;

import java.util.Random;

public abstract class Sort {

	public abstract void sort(int[] array);

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + ":" + array[i] + "\t");
		}
		System.out.println();
	}

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void test() {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = new Random().nextInt(100);
		}
		for (int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
		sort(array);
		for (int i : array) {
			System.out.print(i + "\t");
		}
	}

}
