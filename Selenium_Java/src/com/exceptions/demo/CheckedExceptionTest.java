package com.exceptions.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {
	
	public void checkedExceptionExample() throws IOException {
		File file = new File("./files/Data123.txt");
		FileReader fr = new FileReader(file);
		int content;
		while ((content=fr.read())!=-1) {
			System.out.println((char)content);
		}
		
		System.out.println("After Catch block with throws..!");
	
	}
	
	
	public void checkedExceptionWithTryCatchExample() {
		
		boolean bFlag=false;
		
		try {
			File file = new File("./files/Data.txt");
			FileReader fr = new FileReader(file);
			int content;
			while ((content=fr.read())!=-1) {
				System.out.println((char)content);
			}
			bFlag=true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			if (bFlag) {
				System.out.println("Successfully read the file content");
			} else {
				System.out.println("Failed to read the file content");
			}
		}
		
		System.out.println("After try catch finally block..!");
		
	}
	
	

	public static void main(String[] args) throws IOException {
		CheckedExceptionTest cet = new CheckedExceptionTest();
		//cet.checkedExceptionExample();
		cet.checkedExceptionWithTryCatchExample();
	}

}
