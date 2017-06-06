package StrategyPattern.type;

import StrategyPattern.composition.MedicalSick;
import StrategyPattern.composition.TailTrue;

public class Snake extends Animal {
    public Snake(String location, String breed, char gender, int age, double size){
        super(location, breed, gender, age, size);
        tailBehavior = new TailTrue();
        medicalBehavior = new MedicalSick();
    }
}
