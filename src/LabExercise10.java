class Account {
    private double balance;
    Account(double b) {
        balance = b;
    }
    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class LabExercise10 {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.showBalance();
        // System.out.println("Current Balanace is = " + balance);
    }
}