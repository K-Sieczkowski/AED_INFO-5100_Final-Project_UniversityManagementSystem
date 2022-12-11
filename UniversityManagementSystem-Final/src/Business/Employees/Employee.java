/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employees;


/**
 *
 * @author ksiec
 */
public class Employee {
    private String name;
    private int id;
    private static int count = 1;
    
    public Employee(){
        id = count;
        count++;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return name;
    }
     public boolean isMatch(String name) {
        if (getName().equals(name)) {
            return true;
        }
        return false;
    }
    
}
