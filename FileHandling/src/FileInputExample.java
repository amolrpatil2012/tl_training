import java.io.FileInputStream;
/*
 * 	In case of FileInputStream  file should exist
 *  else will throw FileNotFoundException
 * 
 */
public class FileInputExample {
	public static void main(String[] args) {
		
		try
		{
			FileInputStream fin = new FileInputStream("d:/xyz/demo.txt");
			
			// read file byte by byte
			// read() returns -1 when file ends - EOF
//			int b = 0;
//			while ( ( b = fin.read() ) != -1)
//				System.out.print((char)b);
			
		
			byte b[] = new byte[fin.available()];		// fin.available() -- return size of file			
			fin.read(b);			
			String s = new String(b);			
			System.out.println(s);
			
			
			
			fin.close();
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
