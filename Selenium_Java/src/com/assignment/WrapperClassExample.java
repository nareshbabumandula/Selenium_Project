package com.assignment;

public class WrapperClassExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//Autoboxing
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  
		
		//Unboxing
		//Converting Integer to int    
		//Integer a1=new Integer(3);    
		Integer a1=10053;
		int i1=a1.intValue();//converting Integer to int explicitly  
		int j1=a1;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a1+" "+i1+" "+j1);    
		
	}

}
