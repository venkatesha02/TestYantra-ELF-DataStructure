package com.tyss.assignment1;
import java.util.HashMap; 
public class Program7 {

	static int lenOfLongSubarr(int[] arr, int n, int k) 
	{ 
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
			int sum = 0, maxLen = 0; 

			for (int i = 0; i < n; i++) { 
				
				sum += arr[i]; 
				
				if (sum == k) 
					maxLen = i + 1; 

				if (!map.containsKey(sum)) { 
					map.put(sum, i); 
				} 

				if (map.containsKey(sum - k)) { 
						
					if (maxLen < (i - map.get(sum - k))) 
						maxLen = i - map.get(sum - k); 
				} 
			} 
			
			return maxLen;			 
	} 

	public static void main(String args[]) 
	{ 
			int[] arr = {10, 5, 2, 7, 1, 9}; 
			int n = arr.length; 
			int k = 15; 
			System.out.println("Length = " + lenOfLongSubarr(arr, n, k)); 
	} 
} 