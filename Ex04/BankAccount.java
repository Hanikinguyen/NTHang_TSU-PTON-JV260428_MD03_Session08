public class BankAccount implements IBank {

    private String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    // Constructor
    public BankAccount(String accountId, double balance,
                       String userName, String phoneNumber) {
        this.accountId = accountId;
        this.balance = balance;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    // Getter
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Nhận tiền
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền gửi phải lớn hơn 0!");
            return;
        }

        balance += amount;
    }

    // Rút tiền
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0!");
            return;
        }

        if (amount > balance) {
            System.out.println("Số dư không đủ để thực hiện giao dịch!");
            return;
        }

        balance -= amount;
    }

    // Hiển thị số dư
    public void displayBalance() {
        System.out.printf(
                "Tài khoản %s - Chủ tài khoản: %s - Số dư: %.0f%n",
                accountId, userName, balance
        );
    }
}