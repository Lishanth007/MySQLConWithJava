package HibernateProject.ORM_hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.schema.internal.exec.ScriptSourceInputFromFile;

public class App 
{
    public static void main( String[] args )
    {
        Ecommerce product1 =new Ecommerce();
        product1.setItemid(1);
        product1.setItemname("Nick");
        product1.setPrice(1200);
        
        Ecommerce product2 =new Ecommerce();
        product2.setItemid(2);
        product2.setItemname("Nife");
        product2.setPrice(8000);
        
        Configuration conObj = new Configuration()
        		.configure().addAnnotatedClass(Ecommerce.class);
        
        SessionFactory sf = conObj.buildSessionFactory();
        Session soSession=sf.openSession();
        
        
        Transaction trans =soSession.beginTransaction();
        		soSession.save(product1);
        
        
        soSession.save(product2);
       
        trans.commit();
       
    }
}
