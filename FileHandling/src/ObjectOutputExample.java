/*
 * 
 * 	Serialization  --> Writing an Object to Stream [ file ]
 * 
 * 		e.g.	oout.writeObject(student);
	
	Deserialization --> Reading an Object from stream [ file ]
	
		e.g.	oin.readObject()
		
		
	In Java you can not serialize any object
 * 
 * 	You can serialize only those object whose 
 *    class implements Serializable interface else NotSerializableException raises
 * 		
 * 
 *  Marker Interfaces
 *  |
 *  Empty interfaces [ not contains any method ]
 *  for checking purpose
 * 
 * 
 */


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	
	public static void main(String[] args) throws Exception {
		
		
		Student student = new Student(1, "Suresh");
		
		FileOutputStream fout = 
				new FileOutputStream("d:/xyz/demo2.txt" , true);
		
		ObjectOutputStream oout =
				new ObjectOutputStream(fout);
		
		oout.writeObject(student);
		
		oout.close();
		
	}

}
