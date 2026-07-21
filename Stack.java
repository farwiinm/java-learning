import java.util.ArrayList;

public class Stack<T> {
  private ArrayList<T> stack = new ArrayList<>();

  public void push(T item){
    stack.add(item);
  }

  public T pop(){
    return stack.removeLast();
  }

  public T peek(){
    return stack.getLast();
  }

  public boolean isEmpty(){
    return stack.isEmpty();
  }

  public int size(){
    return stack.size();
  }

  @Override
    public String toString() {
        return stack.toString();
    }
    
  public static void main(String[] args){
    Stack<String> stringStack = new Stack<>();
    stringStack.push("Hi");
        stringStack.push("World");
    System.out.println("String Stack: " + stringStack); // [Hi, World]
        System.out.println("Peek top: " + stringStack.peek()); // World
        System.out.println("Popped: " + stringStack.pop());   // World
        System.out.println("Size: " + stringStack.size());    // 1


    Stack<Integer> intStack = new Stack<>();
    intStack.push(10);
        intStack.push(20);

        System.out.println("Integer Stack: " + intStack);   // [10, 20]
        System.out.println("Popped: " + intStack.pop());     // 20
        System.out.println("Is empty? " + intStack.isEmpty()); // false

  }
}
