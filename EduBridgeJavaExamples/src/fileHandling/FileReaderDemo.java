package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\Temp\\abc.txt");
		
		fr.close();
	}

}
