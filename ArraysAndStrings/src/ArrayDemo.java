
/*
 * 			int a[] = new int[size];
 * 
 * 			Student s[] = new Student[10];
 * 			s[0] = new Student();
 * 			s[1] = new Student(); ...
 * 
 * 			Every array is having length property which gives size of an Array
 * 
 * 			int a[][] = new int[rows][cols]
 * 
 */

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter Elements of an Array");
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = scanner.nextInt();
		
		int sum = 0;
		// for-each loop - traverse an array
		for ( int x : arr)				// for ( int i =0 ; i<arr.length ; i++)
		{
			sum += x;
		}
		
		System.out.println(" Sum : " + sum);
		System.out.println(" Avg : " + sum / arr.length);
		
		
	}

}
