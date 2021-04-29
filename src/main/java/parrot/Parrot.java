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

    public static Parrot giveBirthToParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage,
        boolean isNailed) {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(voltage, isNailed);
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
    	return 12.0;
    }
}
