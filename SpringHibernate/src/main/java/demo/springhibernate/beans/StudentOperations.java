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
	
	
	public void insert ( Student student )
	{
		Session session =	factory.openSession();				// represents database connection
		Transaction transaction = session.beginTransaction();	// represents database dml
		session.persist(student);                               // insert query
		transaction.commit();                                   // transaction will permanent
		
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
		session.remove(st);
		transaction.commit();
		
	}
	
	
	
	
	
	
}
