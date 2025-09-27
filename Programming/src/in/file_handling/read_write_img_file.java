package in.file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class read_write_img_file {
	
	public static void main(String[] args) throws IOException{
		
		String inn="C:\\Users\\91702\\Desktop\\J2EE files\\JAVA\\1749480421610.jpeg";
		String outt="C:\\Users\\91702\\Desktop\\J2EE files\\ext.txt";
		
		try {
			FileInputStream in=new FileInputStream(inn);
			//FileOutputStream out=new FileOutputStream(outt,true);
			FileWriter file=new FileWriter(outt,true);
			
			
			int bytee;
			while((bytee=in.read()) !=-1)
			{
				
				System.out.println(bytee);
				
				file.write(String.valueOf(bytee));
				file.write("\n");
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
