package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter array of size 10");
		int[] array = new int[] { 12, 9, 0, 6, 445, 45, 6, 7, 546 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i]-array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
