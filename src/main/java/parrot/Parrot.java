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

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot giveBirthToParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage,
        boolean isNailed) {
        return new Parrot(type, numberOfCoconuts, voltage, isNailed);
    }

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

    private double getBaseSpeed() {
    	return 12.0;
    }
    
    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }


}
