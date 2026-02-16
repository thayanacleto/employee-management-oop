package OutsourcedEmployee.entities;

public class Employee {
    private String name; 
    private int  hours; 
    private double valuePeHours;



    public Employee(){

    }

    public Employee(int hours, String name, double valuePeHours) {
        this.hours = hours;
        this.name = name;
        this.valuePeHours = valuePeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePeHours() {
        return valuePeHours;
    }

    public void setValuePeHours(double valuePeHours) {
        this.valuePeHours = valuePeHours;
    }

    public double payment() {
        return valuePeHours * hours;

    }
    
}
