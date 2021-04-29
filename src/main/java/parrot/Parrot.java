package parrot;

/*
 *
 * When does it make sense to refactor a class like this?
 *
 * - currently it's simple enough to refactor it now - point of now return
 * - too many tests need to be adapted
 * - the current implementation can't be tested easily:
 * 		time(adding test to existing code) >= time(refactor) + time(adding tests to refactored code)
 * - implementing a new feature or new case needs a lot of time
 * - the code has low cohesion
 *
 */

public abstract class Parrot {

  public static NorwegianBlueParrot createNorwegianBlueParrot(double voltage, boolean isNailed) {
    return new NorwegianBlueParrot(voltage, isNailed);
  }

  public static AfricanParrot createAfricanParrot(int numberOfCoconuts) {
    return new AfricanParrot(numberOfCoconuts);
  }

  public static EuropeanParrot createEuropeanParrot() {
    return new EuropeanParrot();
  }

  public abstract double getSpeed();

  protected double getBaseSpeed() {
    return 12.0;
  }
}
