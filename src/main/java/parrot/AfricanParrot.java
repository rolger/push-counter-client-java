package parrot;

public class AfricanParrot extends Parrot {

  public static final double DEFAULT_LOAD_FACTOR = 9.0;
  private final int numberOfCoconuts;

  public AfricanParrot(int numberOfCoconuts) {
    this.numberOfCoconuts = numberOfCoconuts;
  }

  @Override
  public double getSpeed() {
    return Math.max(0, getBaseSpeed() - DEFAULT_LOAD_FACTOR * numberOfCoconuts);
  }

}
