public class AnimalPolymorphism{
  String name;
  int age;

  public AnimalPolymorphism(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void makeSound(){
    System.out.println(name+"made a noise");
  }
 
  public void describe(){
    System.out.println(name+" is "+age+" years old.");
  }


  public static void main(String[] args){
      AnimalPolymorphism[] animals = new AnimalPolymorphism[3];
      animals[0] = new Dog("Doggy",5,"Collie");
      animals[1] = new Cat("Kitty",2);
      animals[2] = new Bird("Birdy",3);

      for (AnimalPolymorphism animal : animals){
        //animal.makeSound();
        //animal.describe();

        if (animal instanceof Dog){
        Dog d = (Dog) animal;
        d.bark();
        }

        if (animal instanceof Bird){
        Bird b = (Bird) animal;
        b.fly();
      }
      
  }
}
}

class Dog extends AnimalPolymorphism{
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

class Cat extends AnimalPolymorphism{
  public Cat(String name, int age){
    super(name,age);
  }

  @Override
  public void makeSound(){
    System.out.println(name+"is making a purr noise");
  }

  
}

class Bird extends AnimalPolymorphism{
  public Bird(String name,int age){
    super(name,age);
  }

  @Override
  public void makeSound(){
    System.out.println(name+"making bird noises");
  }

  public void fly(){
    System.out.println("Flying");
  }
}


