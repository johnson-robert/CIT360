/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmeConnection;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author User
 */

public class Controller {
    private static SessionFactory sessionFactory;
    //use static if using view
    public static void main(String[] args){
        try {
            System.out.println("Made it this far.");
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    //for using view
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }

 // Method to  READ all the employees
   public void listCategories( ){
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      
      try {
         System.out.println("Made it this far too.");
         tx = session.beginTransaction();
         List category = session.createQuery("FROM Categories").list(); 
         for (Iterator iterator = category.iterator(); iterator.hasNext();){
            Categories categories = (Categories) iterator.next(); 
            System.out.print("First Name: " + categories.getCategoryId()); 
            //System.out.print("  Last Name: " + employee.getLastName()); 
            //System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         System.out.println("Made it too here."); 
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}