package StrategyPattern.composition;

public class MedicalSick implements MedicalBehavior{
     @Override
    public String healthStatus() {
        return "Sick";
    }
}
