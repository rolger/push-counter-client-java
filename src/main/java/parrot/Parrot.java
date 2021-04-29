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

    protected ParrotTypeEnum type;
    protected int numberOfCoconuts;
    protected double voltage;
    protected boolean isNailed;

    Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot giveBirthToParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage,
        boolean isNailed) {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
    	return 12.0;
    }
    
    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }


}
