package OutsourcedEmployee.application;

import OutsourcedEmployee.entities.Employee;
import OutsourcedEmployee.entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US); 
    Scanner sc = new Scanner(System.in);
  
    List<Employee> list = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt(); 

    for(int i = 1; i <= n; i++){
        System.out.println("Employee #" + i + " data");
        sc.nextLine();
        System.out.print("Outsourced (y/n)? ");
        String outsourced = sc.nextLine(); 
        char out = outsourced.charAt(0);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Hours: ");
        int hours = sc.nextInt(); 
        System.out.print("value per hour: ");
        double valuePeHours = sc.nextDouble();

        if(out == 'y' || out == 'Y'){
            System.out.print("Additional charge: ");
            double additionalCharge = sc.nextDouble(); 
            Employee OutsourcedEmployee = new OutsourcedEmployee(hours, name, valuePeHours, additionalCharge);
            list.add(OutsourcedEmployee);

        } 
        else {
            Employee employee = new Employee(hours, name, valuePeHours); 
            list.add(employee);
        }
    }

    System.out.println("PAYMENTS: ");

     for (Employee emp : list){
        System.out.printf("%s - $ %.2f%n", emp.getName(), emp.payment());
    }

    }

}
