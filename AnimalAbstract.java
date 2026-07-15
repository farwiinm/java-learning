public abstract class AnimalAbstract{
  String name;
  int age;

  public AnimalAbstract(String name, int age){
    this.name = name;
    this.age = age;
  }

  public abstract void makeSound();
 
  public void describe(){
    System.out.println(name+" is "+age+" years old.");
  }

  public static void processAnimal(AnimalAbstract a){
    a.makeSound();
    a.describe();

    if (a instanceof Dog){
      Dog d = (Dog) a;
      d.bark();
    }

    if (a instanceof Cat){
      System.out.println("Cat in instanceof");      
    }

    if (a instanceof Bird){
      Bird b = (Bird) a;
      b.fly();
    }

    if (a instanceof Flyable){
      Flyable f = (Flyable) a;
      f.fly();
      f.getMaxAltitude();
    }
  }

  public static void main(String[] args){
      AnimalAbstract[] animals = new AnimalAbstract[4];
      animals[0] = new Dog("Doggy",5,"Collie");
      animals[1] = new Cat("Kitty",2);
      animals[2] = new Bird("Birdy",3,5.7);
      animals[3] = new Duck("ducky",5,4.3);

      for (AnimalAbstract animal : animals){
        processAnimal(animal);
  }
}
}

interface Flyable{
  void fly();
  double getMaxAltitude();
}

interface Swimmable{
  void swim();
}

class Dog extends AnimalAbstract{
  String breed;

  public Dog(String name,int age,String breed){
    super(name,age);
    this.breed=breed;
  }

  @Override
  public void makeSound(){
    System.out.println(name+"made a bark");
  }

  @Override
  public void describe(){
    System.out.println(name+" is "+age+" years old of breed "+breed);
  }

  public void bark(){
    System.out.println("woof");
  }
}

class Cat extends AnimalAbstract{
  public Cat(String name, int age){
    super(name,age);
  }

  @Override
  public void makeSound(){
    System.out.println(name+"is making a purr noise");
  }

  
}

class Bird extends AnimalAbstract implements Flyable{
  private double maxAlititude;

  public Bird(String name,int age,double maxAlititude){
    super(name,age);
    this.maxAlititude=maxAlititude;
  }

  @Override
  public void makeSound(){
    System.out.println(name+"making bird noises");
  }

  public void fly(){
    System.out.println("Flying");
  }

  public double getMaxAltitude(){
    return maxAlititude;
  }
}

class Duck extends AnimalAbstract implements Flyable,Swimmable{
  private double maxAlititude;

  public Duck(String name, int age, double maxAlititude){
    super(name,age);
    this.maxAlititude=maxAlititude;
  }

  public double getMaxAltitude(){
    return maxAlititude;
  }

  public void fly(){
    System.out.println(name+" is flying");
  }

  public void makeSound(){
    System.out.println(name+" is quacking");
  }

  public void swim(){
    System.out.println(name+" swam!");
  }

}