package demo.springhibernate.beans;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class StudentOperations {

	@Autowired
	SessionFactory factory;
	
	// 34 , "AA" , "BB"		-- new entry
	public void insert ( Student student )
	{
		Session session =	factory.openSession();				// represents database connection
		Transaction transaction = session.beginTransaction();	// represents database dml
		try
		{
			session.persist(student);                               // insert query
			transaction.commit();                                   // transaction will permanent
		}
		catch(Exception e)
		{
			transaction.rollback();
		}
		
		/*
		 * 		List<Student> students;		// 100 students
		 * 
		 * 		try
		 * 		{
		 * 			for ( Student s : students )
		 * 				session.persist(s);
		 * 			session.commit();
		 * 		}
		 * 		catch(Exception e)
		 * 		{
		 * 				transaction.rollback();
		 * 		}
		 * 		
		 * 
		 * 
		 */
		
		
	}
	// select * from student
	public List<Student> getAllStudents()
	{
		Session session = factory.openSession();
		String sql = "from Student";						
		List<Student> stds = session.createQuery(sql).list();
		return stds;
	}
	
	// delete from student where roll = 1
	public void delete ( int roll )
	{

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student st =	session.get(Student.class, roll);		// select student from where roll = 1
		if ( st != null )
		{
			session.remove(st);
			transaction.commit();
		}
		else 
			System.out.println();
		
	}
	// 34 , "AA" ,"XX"
		public void update ( Student newStudent )
		{

			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.persist(newStudent);				// update
			transaction.commit();
			
		}
	
	
	
	
	
}
