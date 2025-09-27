package in.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_file {
	
	public static void main(String[] args) {
		
		try {
			FileWriter write=new FileWriter("C:\\\\Users\\\\91702\\\\Desktop\\\\J2EE files\\\\ext.txt");
			write.write("hi i am shridhar");
			write.close();
			System.out.println("written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
