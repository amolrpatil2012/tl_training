import java.io.File;
import java.io.IOException;

public class FileClassExample {
public static void main(String[] args) throws IOException {
	
		//File file = new File("d://Hello.java");
		//System.out.println("Size Of File : " +file.length());
		//System.out.println( " Can Read :" + file.canRead());
		//file.delete();
	
		//File file = new File("d:/xyz");
		//file.mkdir();
		
		File file = new File("d:/xyz/demo.txt");
		file.createNewFile();
}
}
