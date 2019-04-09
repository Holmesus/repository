package offer;

/**选择排序 不稳定排序*/
public class SelectionSort {

	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
	}
}
