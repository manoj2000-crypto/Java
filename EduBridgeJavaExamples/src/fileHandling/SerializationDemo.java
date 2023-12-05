package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Student stu = new Student(26, "Manoj");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Temp\\abc.txt"));
		objectOutputStream.writeObject(stu);
		objectOutputStream.flush();
		System.out.println("Converted to byte stream.");
		objectOutputStream.close();
	}

}
