package in.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File_reading_scanner {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\\\Users\\\\91702\\\\Desktop\\\\J2EE files\\\\ext.txt");
		
		try {
			Scanner sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
