package StrategyPattern.composition;

public class MedicalHealthy implements MedicalBehavior{

    @Override
    public String healthStatus() {
        return "Healthy";
    }
    
}
