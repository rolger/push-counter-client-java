package parrot;

public class EuropeanParrot extends Parrot {

  private final int numberOfCoconuts;
  private final double voltage;
  private final boolean isNailed;

  public EuropeanParrot(int numberOfCoconuts, double voltage,
      boolean isNailed) {
    this.numberOfCoconuts = numberOfCoconuts;
    this.voltage = voltage;
    this.isNailed = isNailed;
  }

  @Override
  public double getSpeed() {
    return getBaseSpeed();
  }
}
