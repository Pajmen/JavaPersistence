/*
jdbc:mysql://localhost:3306/?user=root

 * and open the template in the editor.
 */
package assignpersist;

import java.io.Serializable;
//da bi se anotacijam,a ova klasa pretvorila u entitet dovoljno je dodati @Entity ispred naziva klase.abstract 
// u Libraries teba dodati biblioteku Persistence JPA
//@Entity  //ovo nedovoljno. 
//@Table(name = "employee") // ovo uvek valja navesti - ime tabele u bazi koja odgovara ovoj klasi
public class Employee implements Serializable{
   // @Id  //definisemo identifikaciju. ako baza generise id, teba dodati generated value
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "emp_id")
    private int id;// ovo valja samo ako se imena kolona u bazi poklapaju sa
    private String name;  // imenima polja klase. U bazi nema id nego Person_id pa dodamoanotaciju
    private int age;      // sa nazivom kplone u bazi ispred odgovarajuceg polja u klasi
    private String address;
    private double income;

    public Employee(String name,int age,String address,double income){
        this.age = age;
        this.name = name;
        this.address = address;
        this.income = income;
    }
    public Employee (){}
    
    public Employee(int id,String name,int age,String address,double income){
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.income = income;
    }
   
    
    @Override
    public String toString(){
        return "id:\t" +getId() + "\n" + "name: " +getName() + ";age: " + getAge() + ";address:" + getAddress()+";wage:  " + getIncome();
    }
     public int getId() {
        return id;
    }

    /**
     * @param name the name to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
     
    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
}
