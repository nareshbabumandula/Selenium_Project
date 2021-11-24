package com.java.programs;

import java.util.Arrays;

public class ArraySortTest {
	
	public int[] sortArray(int[] marks) {
		
		int len=marks.length;
		for (int i = 0; i <len-1; i++) {
			if (marks[i]>marks[i+1]) {
				int temp=marks[i]; //swapping elements in an array
				marks[i]=marks[i+1];
				marks[i+1]=temp; // Swapping done
				i=-1;
			}
		}
		
		return marks;
	}
	
	public static void main(String[] args) {
		int marks[]= {90,70,20,50,85,65};
		ArraySortTest ast=new ArraySortTest();
		System.out.println("Array before sorting is : " + Arrays.toString(marks));
		marks=ast.sortArray(marks);
		System.out.println("Array after sorting is : " + Arrays.toString(marks));
		

	}

}
