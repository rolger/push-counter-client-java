package parrot;

public class NorwegianBlueParrot extends Parrot {

  private final int numberOfCoconuts;
  private final double voltage;
  private final boolean isNailed;

  public NorwegianBlueParrot(int numberOfCoconuts, double voltage,
      boolean isNailed) {
    this.numberOfCoconuts = numberOfCoconuts;
    this.voltage = voltage;
    this.isNailed = isNailed;
  }

  @Override
  public double getSpeed() {
    return (isNailed) ? 0 : getBaseSpeed(voltage);
  }
}
