public abstract class PaymentMethod {

    protected double amount;

    // Constructor không tham số
    public PaymentMethod() {
    }

    // Constructor đầy đủ tham số
    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    // Phương thức trừu tượng
    public abstract double processPayment();

    public abstract double calculateFee();

    public abstract String processPayment(String currency);
}
