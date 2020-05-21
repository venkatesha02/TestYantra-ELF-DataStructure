package com.tyss.assignment1;

public class Program9 {

	int findSubArray(int arr[], int n) {
		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex = 0;

		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					startindex = i;
				}
			}
		}
		endindex = startindex + maxsize - 1;
		
		if (maxsize == -1)
			System.out.println("No such subarray");
		else
			System.out.println(startindex + " to " + endindex);

		return maxsize;
	}


	public static void main(String[] args) {
		Program9 sub;
		sub = new Program9();
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int size = arr.length;

		sub.findSubArray(arr, size);
	}
}
