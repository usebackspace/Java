package exception;

class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance! You have only " + balance
            );
            // throw new ArithmeticException("Balance is very Less");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank(5000); // initial balance

        account.withdraw(6000); // This will throw an exception
        account.withdraw(3000); 
    }
}
