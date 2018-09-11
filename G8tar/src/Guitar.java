public class Guitar {

  private String serialNumber;
  private double price;
  private G8tarSpecs specs;
  

  public Guitar(String serialNumber, double price,
                Builder builder, String model, Type type,
                Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.specs = new G8tarSpecs();
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  public Builder getBuilder() {
    return this.specs.getBuilder();
  }
  public String getModel() {
    return this.specs.getModel();
  }
  public Type getType() {
    return this.specs.getType();
  }
  public Wood getBackWood() {
    return this.specs.getBackWood();
  }
  public Wood getTopWood() {
    return this.specs.getTopWood();
  }
}
