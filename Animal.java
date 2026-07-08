public class Animal{
  String name;
  int age;

  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void eat(){
    System.out.println(name+"is eating");
  }

  public void makeSound(){
    System.out.println(name+"is making a noise");
  }

  public static void main(String[] args){
  Dog dog = new Dog("Rex",5);
  Cat cat = new Cat("Kitty",6);
  Bird bird = new Bird("Birdy", 1);

  dog.eat();
  dog.makeSound();
  cat.eat();
  cat.makeSound();
  bird.eat();
  bird.makeSound();
}
}

class Dog extends Animal{
  public Dog(String name, int age){
    super(name,age);
  }

  @Override
  public void makeSound(){
    System.out.println(name+"is making a bark noise");
  }
}

class Cat extends Animal{
  public Cat(String name, int age){
    super(name,age);
  }

  @Override
  public void makeSound(){
    System.out.println(name+"is making a purr noise");
  }
}

class Bird extends Animal{
  public Bird(String name, int age){
    super(name,age);
  }

  @Override
  public void makeSound(){
    System.out.println(name+"making bird noises");
  }
}


