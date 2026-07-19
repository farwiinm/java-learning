import java.util.HashMap;

public class MiniInventorySystem {
  HashMap<String,Integer> productQuantity = new HashMap<>();

  public void addProduct(String name, int qty){
    productQuantity.put(name,qty);
  }

  public void removeProduct(String name){
    productQuantity.remove(name);
        System.out.println(productQuantity);

  }

  public void updateQuantity(String name, int qty){
    if (productQuantity.get(name)!=qty){
      productQuantity.put(name,qty);    
    }       
    System.out.println(productQuantity);
  }

  public void getLowStock(int threshold){
    productQuantity.entrySet().stream().filter(p->p.getValue()<threshold).forEach(p->System.out.println(p));
  }
  public static void main(String[] args){
    MiniInventorySystem product1 = new MiniInventorySystem();
    product1.addProduct("Sugar", 5);
    product1.addProduct("Syrup", 5);
    product1.addProduct("Bottle", 2);
    product1.removeProduct("Sugar");
    product1.updateQuantity("Syrup", 7);
    product1.getLowStock(9);
  }
}
