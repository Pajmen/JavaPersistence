/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignpersist;

import static assignpersist.Manager.entityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author Pajmen
 */
public class Erasure {
      Employee empl;
      int eid;
      String delname;
    private void Erasure(int eid,String delname){
       
      this.eid = eid;
      this.delname = delname;
     
    }
      public static void erase(int eid){
         
           entityManager = Manager.createManager();
           
          
       
         try{  
             Employee  empl = entityManager.find(Employee.class, eid);
        entityManager.getTransaction().begin();
            entityManager.remove(empl);
        entityManager.getTransaction().commit(); }
         catch(Exception E){JOptionPane.showMessageDialog(null,"We're lookin for a number.If nor sure,run through a database");}
    }   
               
     public static void eraseByName(String delname){   
        entityManager = Manager.createManager();
         
      try{
          System.out.println(delname);
         entityManager.getTransaction().begin();
         TypedQuery<Employee> query = entityManager.createQuery(" delete from Employee e where e.name = :delname",Employee.class);
        int deletedCount = query.setParameter("delname",delname).executeUpdate();
        entityManager.getTransaction().commit(); 
      }catch(Exception e){
          System.out.println(e);
          JOptionPane.showMessageDialog(null, "No such name in database");}
 
     
     }
         
        
         
         
     }   
         
         
     

