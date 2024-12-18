	class Student
	{
		int roll;
		String name;
	
		Student ( int roll , String name)
		{
			this.roll = roll;
			this.name = name;
		}
		
		// changing definition for equality of student object
		@Override
		public boolean equals ( Object obj)
		{
			Student s = (Student)obj;			// s ---> s2 object s1---> this
			//boolean b1 = this.roll == s.roll;		// comparing roll nos 
			//boolean b2 = this.name.equals(s.name);	// comparing names
			//return b1 && b2 ;
			
			return this.roll == s.roll && this.name.equals(s.name);
			
		}
		
	}
public class Test {
	
	public static void main(String[] args) {
		Student s1 = new Student(1 , "Ramesh");
		Student s2 = new Student(2 , "Ramesh");
		// compares address in s1 and s2 which is different -- false
		System.out.println ( s1 == s2 );				
		// compares addresses  in s1 and s2 which is different -- false
		// default definition
		System.out.println ( s1.equals ( s2 ))	;		
	}

}
