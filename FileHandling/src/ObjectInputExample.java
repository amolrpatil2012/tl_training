import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {
	public static void main(String[] args)throws Exception {
		
		FileInputStream fin =
				new FileInputStream("d:/xyz/demo2.txt");
		
		ObjectInputStream oin =
				new ObjectInputStream(fin);	
		
		Student s =(Student) oin.readObject();
		
		System.out.println(s);
		
		oin.close();
		
		
		
	}

}
