public class BankAccountEncapsulation{
  //properties
  private String ownerName;
  private double balance;
  private int accountNumber;

  //constructor
  public BankAccountEncapsulation(String ownerName,double balance,int accountNumber){
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
}

class TestBank{
  public static void main (String[] args){
  //creating object
    BankAccountEncapsulation account1 = new BankAccountEncapsulation("Farwin", 100000.2, 123456);
    BankAccountEncapsulation account2 = new BankAccountEncapsulation("Mahir", 100000.23, 123456);
    //calling methods
    account1.deposit(1000);  
    account2.withdraw(100);
    System.out.println(account1.getBalance());
    System.out.println(account2.getBalance());
  }
}