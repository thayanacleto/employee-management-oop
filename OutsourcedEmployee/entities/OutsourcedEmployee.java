package OutsourcedEmployee.entities;

public class OutsourcedEmployee extends Employee { 

    private Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(Integer hours, String name, Double valuePeHours, Double additionalCharge) {
        super(hours, name, valuePeHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override 
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }







    }
    

