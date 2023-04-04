package p3;

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator t = new TaxCalculator();
        double tax;
        try {
            tax = t.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is:" + tax);
        } catch (CountryNotvalidException c) {
            System.out.println(c.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
