package offer;

public class Solution {

	public static boolean duplicate(int numbers[], int length, int[] duplication) {

		for (int i = 1; i < length; i++) {
			int a = numbers[i];
			for (int j = i - 1; j >= 0; j--) {
				if (a == numbers[j]) {
					duplication[0] = a;
					return true;
				} else if (a < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2,1,3,1,4 };
		int[] duplication = new int[5];

		duplicate_1(arr, arr.length, duplication);
		for (int i : arr) {

			System.out.print(i + "\t");
		}
	}

	public static boolean duplicate_1(int numbers[], int length, int[] duplication) {

		for (int i = 0; i < length; i++) {
			while (i != numbers[i]) {
				if (numbers[i] == numbers[numbers[i]]) {
					duplication[0] = numbers[i];
					return true;
				}

				int temp = numbers[i];
				numbers[i] = numbers[numbers[i]];
				numbers[temp] = temp;
			}
		}
		return false;
	}
	
	public static void swap(int[] numbers,int i,int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
