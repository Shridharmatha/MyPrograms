package in.file_handling;

import java.io.File;

public class delete_file {
	
	public static void main(String[] args) {
		
		
		File file=new File("C:\\Users\\91702\\Desktop\\J2EE files\\ext1.txt");
		
		if(file.delete())
		{
			System.out.println("file deleted successfull :"+file.getName());
		}else
		{
			System.out.println("file not deleted");
		}
	}

}
