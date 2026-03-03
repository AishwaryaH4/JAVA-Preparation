class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(123, 5000);
        b.deposit(1000);
        b.withdraw(2000);
        b.display();
    }
}
