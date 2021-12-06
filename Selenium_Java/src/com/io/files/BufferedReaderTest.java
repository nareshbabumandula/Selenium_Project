package com.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import graphql.language.FragmentDefinition;

public class BufferedReaderTest {

	public void fileReaderExample() {

		boolean bFlag=false;

		try {
			File file = new File("./files/Data.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			/*
			 * int content; while ((content=br.read())!=-1) {
			 * System.out.println((char)content); }
			 */
			String line="";
			System.out.println("Reading line by line..!");
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			fr.close();
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

	public static void main(String[] args) {
		BufferedReaderTest fr = new BufferedReaderTest();
		fr.fileReaderExample();

	}

}