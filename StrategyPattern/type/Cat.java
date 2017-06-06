package StrategyPattern.type;

import StrategyPattern.composition.MedicalHealthy;
import StrategyPattern.composition.MedicalSick;
import StrategyPattern.composition.TailTrue;

public class Cat extends Animal {
    public Cat(String location, String breed, char gender, int age, double size){
        super(location, breed, gender, age, size);
        tailBehavior = new TailTrue();
        medicalBehavior = new MedicalSick();
    }
}
