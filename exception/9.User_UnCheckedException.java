package exception;

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}


class User_UnCheckedException {
    double balance = 5000;

    void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        User_UnCheckedException account = new User_UnCheckedException();
        account.withdraw(-1000); // Runtime exception
    }
}
