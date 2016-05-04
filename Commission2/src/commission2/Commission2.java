/*
 Add a third overloaded method to the Commission application you created in Commission.
The third overloaded method takes a single parameter representing sales.
When this method is called, the commission rate is assumed to be 7.5% and the results are displayed.
To test this method, add an appropriate call in the Commission program's main () method.
Save the application as Commission2.java
 */
package commission2;

/**
 *
 * @author scigazer
 */
public class Commission2 {
    public static void main(String[] args) {
        double Sales = 5000.00;
        double commRate = 0.5;
        int commrate = 50;
        computeCommission(Sales, commRate);
        computeCommission(Sales, commrate);
        computeCommission(Sales);
    }
    public static void computeCommission(double Sales, double commRate) {
        System.out.println("Sales Commission: " + "Php " + (Sales * commRate));
    }
    public static void computeCommission(double Sales, int commrate) {
        System.out.println("With " + commrate + "% commission rate, the commission is Php " + ((commrate / 100.0) * Sales));
    }
    public static void computeCommission(double Sales) {
        double fixedRate = 75;
        System.out.println("Commission on sales of Php " + Sales + " with a fixed rate of " + (fixedRate) + "% is " + ((fixedRate / 100.0) * Sales));
    }
}
