package in.file_handling;

import java.io.File;
import java.io.IOException;

public class Basic_file {
	
	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\91702\\Desktop\\J2EE files\\ext1.txt");
		try
		{
			if(file.createNewFile())
			{
				System.out.println("file is created");
			}else
			{
				System.out.println("file is not created");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
		
	}

}
