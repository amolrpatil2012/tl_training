import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputExample {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fin = 
				new FileInputStream("d:/xyz/demo1.txt");
		
		DataInputStream din =
				new DataInputStream(fin);
		
		System.out.println(" Roll " + din.readInt());
		System.out.println(" Name " + din.readUTF());
		System.out.println(" Marks " + din.readDouble());
		
		din.close();
		
		
		
	}
}
