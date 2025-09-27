package in.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Append_file {
	
	public static void main(String[] args) {
		
		try {
			FileWriter file=new FileWriter("C:\\Users\\91702\\Desktop\\J2EE files\\ext.txt",true);
			file.write("hi are u chinni");
			file.close();
			
			System.out.println("file written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
