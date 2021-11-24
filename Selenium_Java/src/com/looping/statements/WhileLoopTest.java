package com.looping.statements;

public class WhileLoopTest {
	
	void whileloopExample(){
		int i=0;
		while (i<10) {
			System.out.println("Iteration is : "+i);
			if(i==10) break;
			i++;
		}
	}

	public static void main(String[] args) {
		WhileLoopTest wlt = new WhileLoopTest();
		wlt.whileloopExample();
	}

}
