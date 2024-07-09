package OOPs;
import java.util.Scanner;



class Employee{
    int salary;
    String name;
    
    public void getSalary(){
        System.out.println("Salary: " + salary);
    }
    
    public void getName(){
        System.out.println("Name: " + name);
    }
    
    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new name: ");
        name = sc.nextLine();
        getSalary();
        sc.close();
    }
}


public class First_CustomClass {

    public static void main(String[] args) {
        Employee sagar = new Employee();
        sagar.name = "OOPSSSSSs";
        sagar.salary = 6000000;
        
        sagar.getName();
        sagar.getSalary();
        
        sagar.setName();
        sagar.getName();
    }
}