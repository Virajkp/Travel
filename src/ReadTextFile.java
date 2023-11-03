package application;

import java.io.*;

public class ReadTextFile {
	
	private String filename;
	private BufferedReader reader;
	
	public ReadTextFile(String str){
		filename = str;
	}
	public void open() {
		try {
			reader = new BufferedReader(new FileReader(filename));
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	}
	public void read() {
		int number=0;
		String line = "";
		
		if ((line = readline()) != null) {
			number = Integer.parseInt(line);
			System.out.println("\n"+number);
		}
		else {
			System.out.println("Incorrect file format");
			return;
		}	
		while ((line = readline()) != null) {
			String[] info = line.split(",");
			System.out.println("\nInfo length: "+info.length);
			for (int j = 0; j < info.length; j++)
				System.out.println(info[j]);
		}
	}
	public String readline() {
		String line = "";
			
		if (reader == null) {
			System.out.println("File not yeat opened");
			return null;
		}
		try {
			line = reader.readLine();
	    }
		catch (IOException e) {
	         e.printStackTrace();
	    } 	
		return line;
	}
}