public class Ex10 {

    public static void main(String[] args) {

        // Tạo các phương thức thanh toán
        PaymentMethod creditCard = new CreditCard(1000000);
        PaymentMethod debitCard = new DebitCard(1000000);
        PaymentMethod cash = new Cash(1000000);

        // Credit Card
        System.out.println("===== CREDIT CARD =====");
        System.out.println("Phí thanh toán: " + creditCard.calculateFee());
        System.out.println("Tổng tiền: " + creditCard.processPayment());
        System.out.println("Thanh toán: " + creditCard.processPayment("VND"));

        // Debit Card
        System.out.println("\n===== DEBIT CARD =====");
        System.out.println("Phí thanh toán: " + debitCard.calculateFee());
        System.out.println("Tổng tiền: " + debitCard.processPayment());
        System.out.println("Thanh toán: " + debitCard.processPayment("VND"));

        // Cash
        System.out.println("\n===== CASH =====");
        System.out.println("Phí thanh toán: " + cash.calculateFee());
        System.out.println("Tổng tiền: " + cash.processPayment());
        System.out.println("Thanh toán: " + cash.processPayment("VND"));
    }
}