import java.util.Arrays;

public class ArrayFundamentals {

	/**
	 * Returns the position of the largest element of the array. If the element
	 * appears in two places in the array, the first index of the element will
	 * be returned.
	 */
	public static int positionOfLargest(int[] nums) {
        int pos = 0;
        for (int a = 0; a < nums.length; a ++) {
            if (nums[a] > nums[pos]) {
                pos = a;
            }
        }
        return pos;
	}

	/**
	 * Returns the first index of "val" in the array. If "val" is not in the
	 * array, returns -1. The array is not in sorted order.
	 */
	public static int indexOf(int[] nums, int val) {
		for (int a = 0; a < nums.length; a ++) {
            if (nums[a] == val) {
                return a;
            }
        }
            return -1;
	}

	/**
	 * Returns the last index of "val" in the array. If "val" is not in the
	 * array, returns -1. The array is not in sorted order.
	 */
	public static int lastIndexOf(int[] nums, int val) {
		for (int a = nums.length - 1; a > 0; a --) {
            if (nums[a] == val) {
                return a;
            }
        }
            return -1;
	}
	/**
	 * Moves all elements of the array left by one position. The right-most
	 * element of the array receives the value from the left-most element. For
	 * example, rotateRight ({9, 12, 14, 43}) becomes {12, 14, 43, 9}.
	 */
	public static void rotateLeft(int[] nums) {
        int a = nums[0];
        for (int b = 0; b < nums.length - 1; b ++) {
            nums[b] = nums[b + 1];
        }
        nums[nums.length-1] = a;
	}

	/**
	 * Moves all elements of the array right by one position. The left-most
	 * element of the array receives the value from the right-most element. For
	 * example, rotateRight ({9, 12, 14, 43}) becomes {43, 9, 12, 14}.
	 */
	public static void rotateRight(int[] nums) {
            int a = nums[nums.length - 1];
            for (int b = nums.length - 1; b > 0; b --) {
                nums[b] = nums[b - 1];
            }
            nums[0] = a;
        }

	/**
	 * Swaps values of the array at position p1 with the element at position p2.
	 * For example swap ({14, 29, 16, 2, 8}, 1, 4) will change the array to {14,
	 * 8, 16, 2, 29}.
	 */
	public static void swap(int[] nums, int p1, int p2) {
        int a = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = a;
	}

	/**
	 * Returns a new array whose elements are in the reverse order of array "a"/
	 * For example, reverse ({5, 19, 2, 6}) returns {6, 2, 19, 5}.
	 */
	public static int[] reverse(int[] a) {
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 19, 12, 45, 1, 4, 19, 21, 12, 45, 3 };

		if (positionOfLargest(a) == 2)
			System.out.println("Passed 1");
		else
			System.out.println("Failed 1");

		if (indexOf(a, 1) == 3)
			System.out.println("Passed 2");
		else
			System.out.println("Failed 2");

		if (indexOf(a, 19) == 0)
			System.out.println("Passed 3");
		else
			System.out.println("Failed 3");

		if (indexOf(a, 55) == -1)
			System.out.println("Passed 4");
		else
			System.out.println("Failed 4");

		if (lastIndexOf(a, 55) == -1)
			System.out.println("Passed 5");
		else
			System.out.println("Failed 5");

		if (lastIndexOf(a, 19) == 5)
			System.out.println("Passed 6");
		else
			System.out.println("Failed 6");
		
		a = new int[] {5, 12, 19, 23};
		rotateLeft(a);
		if (Arrays.equals(a, new int[] {12, 19, 23, 5}))
			System.out.println("Passed 7");
		else
			System.out.println("Failed 7");

		a = new int[] {5, 12, 19, 23};
		rotateRight(a);
		if (Arrays.equals(a, new int[] {23, 5, 12, 19}))
			System.out.println("Passed 8");
		else
			System.out.println("Failed 8");

		a = new int[] {5, 12, 95, 16, 77, 19, 23};
		swap(a, 1, 3);
		if (Arrays.equals(a, new int[] {5, 16, 95, 12, 77, 19, 23}))
			System.out.println("Passed 9");
		else
			System.out.println("Failed 9");
		
		a = new int[] {5, 12, 19, 23};
		int[] b = reverse(a);
		if (Arrays.equals(b, new int[] {23, 19, 12, 5}))
			System.out.println("Passed 10");
		else
			System.out.println("Failed 10");

	}

}