/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignpersist;

import static assignpersist.Main.inQuery;
import static assignpersist.Manager.entityManager;
import static gui.Find.jTextArea1;
import static gui.Find.jTextField1;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Pajmen
 */
public class Display {
    
    public void Display(){
       EntityManager entityManager;
    }
    public static List<Employee> display(){
        entityManager = Manager.createManager();
       entityManager.getTransaction().begin();
      if(jTextField1.getText().isEmpty() == false)
       {   inQuery = jTextField1.getText();}
        
       TypedQuery<Employee> query = entityManager.createQuery(inQuery,Employee.class);
       
       
        // upit sa nekim filtriranjm:osobe izmedju 30 i 50 god
     //   TypedQuery<Person> query = entityManager.createQuery("select p from Employee p where p.age>35 and p.age<50",Employee.class);
        List<Employee> persons = query.getResultList();
        for( Employee person: persons){
        jTextArea1.append(person.toString() + "\n");
        }
        entityManager.getTransaction().commit();
        return null;
        
       
    }
}
