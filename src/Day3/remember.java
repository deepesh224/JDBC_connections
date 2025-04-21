//package Day3;
//
//public class remember {
//
//	import org.hibernate.Session;
//	import org.hibernate.SessionFactory;
//	import org.hibernate.Transaction;
//	import org.hibernate.boot.Metadata;
//	import org.hibernate.boot.MetadataSources;
//	import org.hibernate.boot.registry.StandardServiceRegistry;
//	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//	public class NetflixController {
//	    public static void main(String[] args) {
//	        // Create StandardServiceRegistry
//	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//	        
//	        // Build Metadata and SessionFactory
//	        Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
//	        SessionFactory sf = md.buildSessionFactory();
//
//	        // Open session and begin transaction
//	        Session session = sf.openSession();
//	        Transaction tx = session.beginTransaction();
//
//	        // Perform database operations here (Insert, Update, Delete)
//
//	        // Commit and close session
//	        tx.commit();
//	        session.close();
//
//	        System.out.println("Hibernate Setup Completed!");
//	    }
//	}
//}
