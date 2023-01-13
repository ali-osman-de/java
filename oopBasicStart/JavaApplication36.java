/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class JavaApplication36 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Person person = new Person();
    Employee employee = new Employee();
    Customer customer = new Customer();
    Owner owner = new Owner();
    
    //Customer//
    System.out.println("Customer------");
    customer.buy();
    customer.report();
    customer.hear();
    customer.walk();
    customer.id();
    
    //emplooyee//
    System.out.println("Employee------");
    employee.produce();
    employee.work();
    employee.hear();
    employee.walk();
    employee.id();
    //owner//
    System.out.println("Owner------");
    owner.manage();
    owner.sell();
    owner.work();
    owner.hear();
    owner.walk();
    owner.id();
    
    }
    
}
