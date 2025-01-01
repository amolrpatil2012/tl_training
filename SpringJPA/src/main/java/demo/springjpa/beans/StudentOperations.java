package demo.springjpa.beans;


import org.springframework.stereotype.Component;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component
public class StudentOperations {
	
	public EntityManager getEntityManager()
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Student_details");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
	
	public void insert ( Student student )
	{
		/*
		 * Hibernate
		Session session =	factory.openSession();				
		Transaction transaction = session.beginTransaction();	
		session.persist(student);                           
		transaction.commit();                               
		*/
		
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();	
		
		
	}

}
