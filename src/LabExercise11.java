class BankAccounts {
    private int accountNumber1;
    private double balance1;
    BankAccounts(int accNo1, double bal1) {
        accountNumber1 = accNo1;
        balance1 = bal1;
    }
    void deposit1(double amount1) {
        if (amount1 > 0)
            balance1 += amount1;
    }
    void withdraw1(double amount1) {
        if (amount1 <= balance1)
            balance1 -= amount1;
    }
    void showBalance1() {
        System.out.println("Account: " + accountNumber1 + "\nBalance: " + balance1);
    }
}
public class LabExercise11 {
    public static void main(String[] args) {
        BankAccounts acc1 = new BankAccounts(10101, 5000);
        acc1.deposit1(1500);
        acc1.withdraw1(1200);
        acc1.showBalance1();
    }
}