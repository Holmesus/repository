package offer;

import java.util.Random;

/** 希尔排序 不稳定排序 插入排序的改良版，gap值为3*h+1时，最优*/
public class ShellSort {

	public static void sort(int[] array) {
		int length = array.length;
		int h = 1;
		while (h < length / 3) {
			h = 3 * h + 1;//1,4,7,10,13,
		}
		while (h >= 1) {

			for (int i = h; i < length; i++) {
				int a = array[i];
				int index = i;
				for (int j = i; j >= h && a < array[j - h]; j -= h) {
					array[j] = array[j - h];
					index = j - h;
				}
				array[index] = a;

			}
			h = h / 3;
		}
	}

	public static void main(String[] args) {
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
