package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 12, 9, 0, 6, 445, 45, 6, 7, 546 };
		int pivot, k = 0;
		for (int i = 0; i < array.length; i++) {
			pivot = array[i];
			k = i;
			for (int j = i + 1; j < array.length; j++) {
				if (pivot > array[j]) {
					pivot = array[j];
					k = j;
				}
			}
			array[k] = array[i];
			array[i] = pivot;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
