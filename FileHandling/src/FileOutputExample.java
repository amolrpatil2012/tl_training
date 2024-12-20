import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 	It will connect to file if it is already exist
		 *  and delete all previous content
		 *  
		 *  If file not exist it will create new file
		 * 
		 */
		
		FileOutputStream fout = 
				new FileOutputStream("d:/xyz/demo.txt" , true);	// true - append mode
		
		System.out.println("Connected to file");
		
		String s = "\n This is new Message";
		byte b[] = s.getBytes();
		
		fout.write(b);
		
		fout.close();
		
		
	}
}
