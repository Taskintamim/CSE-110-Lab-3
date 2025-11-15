class BankAccount {
    int accountNo;
    double balance;
    BankAccount(int acc, double bal) {
        accountNo = acc;
        balance = bal;
    }
    boolean isSame(BankAccount other) {
        return (accountNo == other.accountNo);
    }
}
public class LabExercise3 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, 5000);
        BankAccount b2 = new BankAccount(1002, 8000);
        BankAccount b3 = new BankAccount(1001, 4000);
        System.out.println(b1.isSame(b2));
        System.out.println(b1.isSame(b3));
    }
}