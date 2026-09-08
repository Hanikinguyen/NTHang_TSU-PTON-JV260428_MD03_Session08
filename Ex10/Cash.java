public class Cash extends PaymentMethod {

    // Constructor không tham số
    public Cash() {
    }

    // Constructor đầy đủ tham số
    public Cash(double amount) {
        super(amount);
    }

    // Không có phí
    @Override
    public double calculateFee() {
        return 0;
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
