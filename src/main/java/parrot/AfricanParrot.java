package parrot;

public class AfricanParrot extends Parrot {

  public AfricanParrot(int numberOfCoconuts, double voltage,
      boolean isNailed) {
    super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
  }

  @Override
  public double getSpeed() {
      switch (type) {
          case EUROPEAN:
              return getBaseSpeed();
          case AFRICAN:
              return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
          case NORWEGIAN_BLUE:
              return (isNailed) ? 0 : getBaseSpeed(voltage);
          default:
              throw new RuntimeException("Should be unreachable");
      }
  }
}
