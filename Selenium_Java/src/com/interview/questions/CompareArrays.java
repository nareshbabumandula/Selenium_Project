package com.interview.questions;

public class CompareArrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,4,6,7,3};
		int arr2[] = {2,3,8,7,4};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
