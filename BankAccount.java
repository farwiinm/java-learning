public class BankAccount{
  //properties
  String ownerName;
  double balance;
  int accountNumber;

  //contructor
  public BankAccount(String ownerName,double balance,int accountNumber){
    this.ownerName=ownerName;
    this.balance=balance;
    this.accountNumber=accountNumber;
  }

  //methods
  public void deposit(double amount){
    balance+=amount;
  }

  public void withdraw(double amount){
    balance -= amount;
  }

  public double getBalance(){
    return balance;
  }

  public void printSummary(){
    System.out.print(ownerName);
    System.out.print(balance);

  }

  public static void main (String[] args){
  //creating object
  BankAccount account1 = new BankAccount("Farwin", 100000.2, 123456);
  BankAccount account2 = new BankAccount("Mahir", 100000.23, 123456);
  BankAccount account3 = new BankAccount("Musa", 10000.23, 123456);
  
  //calling methods
  account1.deposit(1000);  
  account2.withdraw(10);
  account1.printSummary();
  account2.printSummary();
  account3.printSummary();
  }

}