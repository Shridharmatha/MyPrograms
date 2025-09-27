package in.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_file {
	
	public static void main(String[] args)    {
		
		try {
			BufferedReader buff=new BufferedReader(new FileReader("C:\\\\Users\\\\91702\\\\Desktop\\\\J2EE files\\\\ext.txt"));
			
			String line;
			while((line=buff.readLine()) != null)
			{
				System.out.println(line);
			}
		    } catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
