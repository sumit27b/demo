package study.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.CustomerEntity;

public class CustomerDao {
	
	public static Session getSession()
	{
		//READING the hibernate.cfg.xml  from the classpath 
		StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
		
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		
		// Create SessionFactory
		SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession(); // start a transaction

		return session;
	}
	
	public int addCustomer(CustomerDao customer) {
		Session session = getSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
		
		return 1;
	}
	
	
	public List<CustomerEntity> getAllCustomer()
	{
		Session session = getSession();
		List<CustomerEntity> productList = session.createQuery("select p from customer_info_tbl p").getResultList();
		return productList;
	}

}
