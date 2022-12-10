/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employees;

import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
    
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public EmployeeDirectory(){
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee findEmployee(String name) {

        for (Employee e : employeeList) {

            if (e.isMatch(name)) {
                return e;
            }
        }
            return null; //not found after going through the whole list
         }
}
