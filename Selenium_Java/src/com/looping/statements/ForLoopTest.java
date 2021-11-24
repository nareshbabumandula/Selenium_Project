package com.looping.statements;

public class ForLoopTest {
	
	void forLoopExample(int num) {
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Iteration is : " +i);
			if (i==6) {
				break;
			}
		}
		
	}
	
    void forLoopArrayExample(int[] marks) {
		System.out.println("No of elements in marks array are : " + marks.length);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Marks array element is : " +marks[i]);
		}
	}
    
    void forEachArray(int[] marks) {
    	System.out.println("For each loop on array started");
    	
    	// for each loop
    	for (int score : marks) {
			System.out.println(score);
		}
    	
    }

    
    void forEachStringArray(String[] names) {
    	System.out.println("forEachStringArray method started");
    	
    	// for each loop
    	for (String person : names) {
			System.out.println(person);
		}
    	
    }
    
    
    
    
	public static void main(String[] args) {
		
		ForLoopTest flt = new ForLoopTest();
		flt.forLoopExample(10);
		int marks[]= {30,40,70,65,80,93,85};
		flt.forLoopArrayExample(marks);
		flt.forEachArray(marks);
		String [] names= {"naresh","hemchand","Kiran","Chaitanya","Kalyan"};
		flt.forEachStringArray(names);
	}

}
