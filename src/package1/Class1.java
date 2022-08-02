package package1;

import java.util.*;

public class Class1 {
	static int lis(int[] arr, int n) {
		int max = 0;
		int[] store = new int[n];

	
		Arrays.fill(store, 1);

	
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && store[i] < store[j] + 1)
					store[i] = store[j] + 1;
			}
		}

				for (int i = 0; i < n; i++)
			if (max < store[i])
				max = store[i];

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 24, 6, 32, 19, 54, 48, 64 };
		int n = arr.length;
		System.out.println("Length of the lis is " + lis(arr, n));
	}

}
