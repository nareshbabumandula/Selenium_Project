package com.looping.statements;

public class DoWhileLoopTest {

	void dowhileloopExample(){
		int i=0;
		do {
			System.out.println("Iteration is : "+i);
			if(i==5) break;
			i++;
		} while (i<10);
	}

	public static void main(String[] args) {
		DoWhileLoopTest dow=new DoWhileLoopTest();
		dow.dowhileloopExample();

	}

}
