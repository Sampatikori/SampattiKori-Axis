package Exception;


import static Exception.TaxCalculator.calculateTax;

public class CalculatorSimulator {
    public static void main(String[] args){

        try {
            double taxAmount = TaxCalculator.calculateTax("Jack",true,55000.00);
            System.out.println("Tax amount is "+ taxAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}