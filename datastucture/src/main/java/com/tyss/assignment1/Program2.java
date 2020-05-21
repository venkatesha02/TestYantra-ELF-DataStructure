package com.tyss.assignment1;

public class Program2 {

	public static int duplicateNumber(int[] array) {

		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					count++;
					if (count > 0) {
						return array[i];

					}
				}
			}
		}
		return count;

	}

	public static void main(String[] args) throws java.lang.Exception {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		System.out.println("Repeating element is : " + duplicateNumber(arr));
	}
}
