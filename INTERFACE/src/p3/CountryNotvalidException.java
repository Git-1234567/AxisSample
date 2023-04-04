package p3;

public class CountryNotvalidException extends Exception{
    public CountryNotvalidException(String message){
        super(message);
    }
}
class EmployeeNameInvalidException extends Exception{
    public EmployeeNameInvalidException(String message){
        super(message);
    }
}
class TaxNotEligibleException extends Exception{
    public TaxNotEligibleException(String message){
        super(message);
    }
}
class TaxCalculator{
    public double calculateTax(String name, boolean isindian, double empSal)throws CountryNotvalidException,EmployeeNameInvalidException,TaxNotEligibleException{
        double taxAmount;
        if(!isindian)
            throw new CountryNotvalidException("The employee should be an Indian citizen for calculating tax");
        if(name.isEmpty())
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        if(empSal>=100000 && isindian)
            taxAmount =empSal *8.0/100;
        else if(empSal>50000 && empSal<100000 &&isindian)
            taxAmount =empSal *6.0/100;
        else if(empSal>30000 && empSal<50000 &&isindian)
            taxAmount =empSal *5.0/100;
        else if(empSal>10000 && empSal<30000 &&isindian)
            taxAmount =empSal *4.0/100;
        else
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        return taxAmount;
    }

}
