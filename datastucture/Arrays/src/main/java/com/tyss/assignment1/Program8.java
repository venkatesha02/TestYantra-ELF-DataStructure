package com.tyss.assignment1;

import java.util.Scanner;

public class Program8 {
	
	public static int removeDuplicateElement(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        temp[j++] = arr[n-1];   
         
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }
     
    public static void main (String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	        
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ " elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int length = arr.length;
        length = removeDuplicateElement(arr, length);
        
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }
}
