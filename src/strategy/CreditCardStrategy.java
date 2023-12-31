package strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculatePayment(double amount) {
        return amount * interestRate;
    }
}