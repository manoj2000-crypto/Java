package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Temp\\abc.txt");
		
		int i = 0;
		while( ( i=fis.read() ) != -1 )
		{
			System.out.print( (char) i);
		}
		fis.close();

	}

}
