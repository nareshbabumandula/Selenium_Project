package com.io.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public void fileReaderExample() {

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

	public static void main(String[] args) {
		FileReaderTest fr = new FileReaderTest();
		fr.fileReaderExample();

	}

}
