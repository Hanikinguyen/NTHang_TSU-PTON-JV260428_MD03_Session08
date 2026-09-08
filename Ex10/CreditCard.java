public class CreditCard extends PaymentMethod {

    // Constructor không tham số
    public CreditCard() {
    }

    // Constructor đầy đủ tham số
    public CreditCard(double amount) {
        super(amount);
    }

    // Phí 2%
    @Override
    public double calculateFee() {
        return amount * 0.02;
    }

    // Tổng tiền phải trả
    @Override
    public double processPayment() {
        return amount + calculateFee();
    }

    // Tổng tiền kèm đơn vị tiền tệ
    @Override
    public String processPayment(String currency) {
        return processPayment() + " " + currency;
    }
}