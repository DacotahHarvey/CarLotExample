public class InventoryItem {
  private Car car;
  private int listPrice;

  public InventoryItem(Car car, int listPrice) {
    this.car = car;
    this.listPrice = listPrice;
  }

  public String toString() {
    return this.car.toString() +
          "ListPrice = " +
          this.listPrice;
  }

  public Car getCar() {
    return this.car;
  }

  public void setListPrice(int listPrice) {
    this.listPrice = listPrice;
  }

  public int getListPrice() {
    return this.listPrice;
  }
}
