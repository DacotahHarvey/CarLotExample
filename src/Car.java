public class Car {
  private int yearManufactured;
  private String licencePlate;
  private String colour;
  private String make;
  private String model;
  private int msrpCents;
  private int priceHistory;

  public Car(int yearManufactured, String licencePlate, String colour, String make, String model, int msrpCents, int priceHistory) {
    this.yearManufactured = yearManufactured;
    this.licencePlate = licencePlate;
    this.colour = colour;
    this.make = make;
    this.model = model;
    this.msrpCents = msrpCents;
    this.priceHistory = priceHistory;
  }

  @Override
  public String toString() {
      return "Car{" +
            "Year Manufactured=" + this.yearManufactured +
            ", Licence Plate='" + this.licencePlate + '\'' +
            ", Colour='" + this.colour + '\'' +
            ", Make='" + this.make + '\'' +
            ", Model='" + this.model + '\'' +
            ", MSRPCents='" + this.msrpCents + '\'' +
            ", Price Sold History='" + this.priceHistory + '\'' +
            '}';
  }

  public int setYearManufactured(int yearManufactured) {
    return this.yearManufactured = yearManufactured;
  }

  public String setLicencePlate(String licensePlate) {
    return this.licencePlate = licensePlate;
  }

  public String setColour(String colour) {
    return this.colour = colour;
  }

  public String setMake(String make) {
    return this.make = make;
  }

  public String setModel(String model) {
    return this.model = model;
  }

  public int setMsrpCents(int msrpCents) {
    return this.msrpCents = msrpCents;
  }

  public int setpriceHistory(int priceHistory) {
    return this.priceHistory = priceHistory;
  }

  public int getYearManufactured() {
    return this.yearManufactured;
  }

  public String getLicencePlate() {
    return this.licencePlate;
  }

  public String getColour() {
    return this.colour;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public int getMsrpCents() {
    return this.msrpCents;
  }

  public int getPriceHistory() {
    return this.priceHistory;
  }


}
