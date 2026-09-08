public class DebitCard extends PaymentMethod {

    // Constructor không tham số
    public DebitCard() {
    }

    // Constructor đầy đủ tham số
    public DebitCard(double amount) {
        super(amount);
    }

    // Phí 1%
    @Override
    public double calculateFee() {
        return amount * 0.01;
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
