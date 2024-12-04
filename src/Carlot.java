import java.util.ArrayList;

public class Carlot {
  private String name;
  private ArrayList<InventoryItem> inventory;

  public Carlot(String name) {
    this.name = name;
    this.inventory = new ArrayList<InventoryItem>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void listInventory() {
    for(int i = 0; i < this.inventory.size(); i++) {
      System.out.println(this.inventory.get(i));
    }
  }

  public ArrayList<InventoryItem> findByMake(String searchKey) {
    ArrayList<InventoryItem> results = new ArrayList<InventoryItem>();

    for (InventoryItem i : this.inventory) {
      if (i.getCar().getMake() == searchKey) {
        results.add(i);
      }
    }

    return results;
  }

  public ArrayList<InventoryItem> sellVehicle(Car licensePlate) {
    ArrayList<InventoryItem> results = new ArrayList<InventoryItem>();

    for (InventoryItem i : this.inventory) {
      if (i.getLicencePlate() == licensePlate) {
        results.add(i);
      }
    }
    
    return results;
  }

  public void buyCar(InventoryItem newCar) {
    this.inventory.add(newCar);
  }
}
