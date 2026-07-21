public class Pair<A,B> {
  private A name;
  private B age;

  public Pair(A name,B age){
    this.name=name;
    this.age = age;
  }

  public A getFirst(){
    return name;
  }

  public B getSecond(){
    return age;
  }

  public Pair<B,A> swap(){
    return new Pair<>(this.age, this.name);
  }

  public static void main(String[] args){
    Pair<String,Integer> student1 = new Pair<String,Integer>("Girl", 5);
    Pair<Dog, BankAccount> item1 = new Pair<Dog,BankAccount>(new Dog("rox",5,"collie"), new BankAccount("Farwin",1000,1234));

    System.out.println(student1.getFirst());
    System.out.println(item1.swap().getFirst());
  }
}
