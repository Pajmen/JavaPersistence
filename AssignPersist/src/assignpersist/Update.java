/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignpersist;

import static assignpersist.Manager.entityManager;
import gui.Change;
import javax.swing.JOptionPane;

/**
 *
 * @author Pajmen
 */
public class Update {
   
    private  Update(int uid){}


public static void update(int uid){

         entityManager = Manager.createManager();
         Employee  empl = entityManager.find(Employee.class, uid);
          if (empl == null  )
             {JOptionPane.showMessageDialog(null, "No such ID in the database");
             return;}
          if(Change.jTextField2.getText().isEmpty() == false )       
          {
              try{  
        
        entityManager.getTransaction().begin();
        empl.setName(Change.jTextField2.getText());
        entityManager.getTransaction().commit(); }
         catch(Exception E){JOptionPane.showMessageDialog(null,"Something's wrong :(");}
    }   
          if(Change.jTextField3.getText().isEmpty() == false )       
          {
              int newAge = Integer.parseInt(Change.jTextField3.getText());
              try{  
        
        entityManager.getTransaction().begin();
        empl.setAge(newAge);
        entityManager.getTransaction().commit(); }
         catch(Exception E){JOptionPane.showMessageDialog(null,"We're lookin for a number.If nor sure,run through a database");}
    }  
            if(Change.jTextField4.getText().isEmpty() == false )       
          {
              try{  
        
        entityManager.getTransaction().begin();
        empl.setAddress(Change.jTextField4.getText());
        entityManager.getTransaction().commit(); }
         catch(Exception E){JOptionPane.showMessageDialog(null,"Something's wrong :(");}
    }  
              if(Change.jTextField5.getText().isEmpty() == false )       
          {
              double newWage = Double.parseDouble(Change.jTextField5.getText());
              try{  
        
        entityManager.getTransaction().begin();
        empl.setIncome(newWage);
        entityManager.getTransaction().commit(); }
         catch(Exception E){JOptionPane.showMessageDialog(null,"We're lookin for a number.If nor sure,run through a database");}
    }  
}
}




