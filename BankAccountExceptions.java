public class BankAccountExceptions {
  // Properties
  String ownerName;
  double balance;
  int accountNumber;

  // Constructor
  public BankAccountExceptions(String ownerName, double balance, int accountNumber) {
    this.ownerName = ownerName;
    this.balance = balance;
    this.accountNumber = accountNumber;
  }

  // Methods
  // CLEANED UP: No try-catch here. Just throw the exception out if validation fails!
  public void deposit(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Enter value more than 0");
    }
    balance += amount;
  }

  // CLEANED UP: Validate first, execute second. No nested ifs needed.
  public void withdraw(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Enter value more than 0");
    }
    if (amount > balance) {
      throw new InsuffientFundsException(amount);
    }
    balance -= amount;
  }

  public double getBalance() {
    return balance;
  }

  public void printSummary() {
    System.out.println("Owner: " + ownerName + " | Balance: " + balance);
  }

  public static void main(String[] args) {
    BankAccountExceptions account1 = new BankAccountExceptions("Farwin", 1000.0, 123456);

    // 1. Testing a bad deposit
    try {
      account1.deposit(-1000); 
    } catch (IllegalArgumentException e) {
      System.out.println("Deposit Failed -> " + e.getMessage());
    }

    // 2. Testing a bad withdrawal (Negative Amount)
    try {
      account1.withdraw(-50);
    } catch (IllegalArgumentException e) {
      System.out.println("Withdrawal Failed -> " + e.getMessage());
    }

    // 3. Testing Insufficient Funds
    try {
      account1.withdraw(50000);
    } catch (InsuffientFundsException e) {
      System.out.println("Withdrawal Failed -> " + e.getMessage());
    }

    // Print final state
    System.out.println("\n--- Final Summaries ---");
    account1.printSummary();
  }
}

class InsuffientFundsException extends RuntimeException {
  public InsuffientFundsException(double amount) {
    super("Insufficient funds, attempted to withdraw: " + amount);
  }
}