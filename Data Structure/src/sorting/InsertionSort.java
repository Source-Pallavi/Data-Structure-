package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 12, 9, 0, 6, 445, 45, 6, 7, 546 };
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			for (int k = 0; k < array.length; k++) {
				System.out.print("  " + array[k]);
			}
			System.out.println("\n");
		}
	}
}
