package ca.cloudunity.community.utility;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			/*
			// load from different directory
			//String hibernatePropsFilePath = "/com/mkyong/persistence/hibernate.cfg.xml";
			String hibernatePropsFilePath = "applicationContext.xml";
			File hibernatePropsFile = new File(hibernatePropsFilePath);
			Configuration configuration = new Configuration();
			configuration.configure(hibernatePropsFile);
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			*/
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			return sessionFactory;
 
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
 
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}
