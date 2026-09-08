public class Ex04 {

    public static void main(String[] args) {

        // Tạo tài khoản A
        BankAccount accountA = new BankAccount(
                "A001",
                1000000,
                "Nguyen Van A",
                "0901234567"
        );

        // Tạo tài khoản B
        BankAccount accountB = new BankAccount(
                "B001",
                500000,
                "Nguyen Van B",
                "0907654321"
        );

        // Hiển thị số dư trước khi chuyển
        System.out.println("===== SỐ DƯ TRƯỚC KHI CHUYỂN =====");
        accountA.displayBalance();
        accountB.displayBalance();

        // Số tiền cần chuyển
        double amount = 300000;

        System.out.println("\n===== THỰC HIỆN CHUYỂN TIỀN =====");
        System.out.println("Chuyển " + amount + " từ A001 sang B001");

        // Kiểm tra số dư trước khi chuyển
        if (accountA.getBalance() >= amount) {

            // Rút tiền ở tài khoản A
            accountA.withdraw(amount);

            // Gửi tiền vào tài khoản B
            accountB.deposit(amount);

            System.out.println("Chuyển tiền thành công!");

        } else {
            System.out.println("Số dư tài khoản A không đủ!");
        }

        // Hiển thị số dư sau khi chuyển
        System.out.println("\n===== SỐ DƯ SAU KHI CHUYỂN =====");
        accountA.displayBalance();
        accountB.displayBalance();
    }
}
