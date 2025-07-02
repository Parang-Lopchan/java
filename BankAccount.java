public class BankAccount {
    String accountNumber;
    double balance;
    String accountHolderName;

    BankAccount(String accNum, double bal, String holderName) {
        accountNumber = accNum;
        balance = bal;
        accountHolderName = holderName;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("123456789", 1000.0, "Alice");
        b.deposit(500.0);
    }
}
