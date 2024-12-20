import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputExample {

		public static void main(String[] args) throws Exception {
			
			int roll = 100;
			String name = "Suresh";
			double marks = 45.56;
			
			FileOutputStream fout = 
					new FileOutputStream("d:/xyz/demo1.txt" , true);
			
			// using fout object we can only write bytes to file
			
			DataOutputStream dout =
					new DataOutputStream(fout);	// Filtering of Streams
			
			// using dout object we can write primitive data types
			
			dout.writeInt(roll);		// 4
			dout.writeUTF(name);		// 6 - Suresh -- Suresh\0\0 - 8
			dout.writeDouble(marks);	// 8
			
			dout.close();
			
			
			
			
			
			
			
			
			
		}
}
