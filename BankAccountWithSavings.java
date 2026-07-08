public class BankAccountWithSavings{
   String ownerName;
   double balance;
   int accountNumber;

  //constructor
  public BankAccountWithSavings(String ownerName,double balance,int accountNumber){
    this.ownerName=ownerName;
    this.balance=balance;
    this.accountNumber=accountNumber;
  }

  //Getter
  public String getOwnerName(){
    return ownerName;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountNumber(){
    return accountNumber;
  }

  //Setter
  public void setOwnerName(String ownerName){
    if (ownerName == null || ownerName.isEmpty()){
      throw new IllegalArgumentException("Owner name cannot be empty");
    }
  }

  //Methods
  public void deposit(double amount){
    if (amount <= 0){
      throw new IllegalArgumentException("Deposit amount cannot be negative");
    }
    balance+=amount;
  }

  public void withdraw(double amount){
    if (amount <= 0){
      throw new IllegalArgumentException("Withdrawal amount cannot be zero");
    } else if (amount>balance) {
      throw new IllegalArgumentException("Insufficient Funds");
    }
    balance-=amount;
  }

  public static void main(String[] args){
    SavingsAccount saving1 = new SavingsAccount("Farwin", 1000, 2, 123450);

    saving1.deposit(10);
    saving1.addInterest(9);
    System.out.println(saving1.getBalance());
  }
}

class SavingsAccount extends BankAccountWithSavings{
  private double interestRate;

  public SavingsAccount(String ownerName, double balance, double interestRate,int accountNumber){
    super(ownerName, balance,accountNumber);
    this.interestRate = interestRate;
  }

  //getter
  public double getInterestRate(){
    return interestRate;
  }

  public void addInterest(double interestRate){
    double interest = getBalance()*interestRate;
    deposit(interest);
  }
}