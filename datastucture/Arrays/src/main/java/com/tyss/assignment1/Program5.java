package com.tyss.assignment1;

public class Program5 {
	
	public static void findMaximumProduct(int[] A) {
		int max_product = Integer.MIN_VALUE;
		int max_i = -1, max_j = -1;

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (max_product < A[i] * A[j]) {
					max_product = A[i] * A[j];
					max_i = i;
					max_j = j;
				}
			}
		}
		int sum = A[max_i] * A[max_j];
		
		System.out.print("Pair is (" + A[max_i] + ", " + A[max_j] + ") is "+ sum);
	}

	public static void main(String[] args) {
		int[] A = { 0, 9, 5, 6 };

		findMaximumProduct(A);
	}
}