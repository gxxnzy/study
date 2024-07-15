package ch18.sec10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFileApp {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("C:/Edu/Temp/person.dat");
			ois = new ObjectInputStream(fis);
			Person person = (Person) ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println(person);
		} catch (Exception e){
			System.out.println("Exception");
		}
		
		
	}

}
