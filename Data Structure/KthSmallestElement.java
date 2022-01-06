import java.util.Arrays;

public class KthSmallestElement {
	public static void main(String[] args) {
		KthSmallestElement obj = new KthSmallestElement();
		int[] A = { 1, 5, 6, 4, 6, 4, 5, 62, 3434, 5 };
		obj.kthsmallest(A, 3);
	}

	public int kthsmallest(final int[] A, int B) {
		Arrays.sort(A);
		return A[B - 1];
	}
}
