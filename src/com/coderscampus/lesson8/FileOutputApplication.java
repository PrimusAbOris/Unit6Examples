package com.coderscampus.lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
// this class extends IOException:
// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; // includes FileNotFoundException

public class FileOutputApplication {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("data.txt"));
			writer.write("I am Alpha and Omega.\n"
					+ "The beginning and the end.");
		} finally {
			if (writer != null) writer.close();
		}
		
		writer.close();
		
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
			for (int i = 2; i > 0; i--) {
				System.out.println(reader.readLine());
			}
		} finally {
			if (reader != null) reader.close();
		}
	}

}
