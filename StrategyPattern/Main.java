package StrategyPattern;

import StrategyPattern.composition.MedicalHealthy;
import StrategyPattern.composition.TailFalse;
import StrategyPattern.type.Animal;
import StrategyPattern.type.Rodent;
import StrategyPattern.type.Bird;

/**
 * Ryan Jones
 * Strategy Pattern
 * How to use: Instantiate Animal as Order Type
 * ex: Animal parrot = new Bird("Location","Breed", 'Gender', age, size);
 * Using composition: you can change the MedicalBehavior.healthStatus(Health/Sick) String 
 * and TailBehavior.Tail(True/False) Boolean
 */

public class Main {
    public static void main(String[] args){
        //Two example will be used
        
        Animal gundi = new Rodent("North Africa", "North African Gundi", 'F', 4, 16);
        System.out.println(gundi.toString());
        gundi.setTailInfo(new TailFalse());
        System.out.println("\nNorth African Gundi - Update\nTail: "+gundi.getTailInfo());
        
        Animal potoo = new Bird("South America", "Potoo", 'M', 2, 28);
        System.out.println(potoo.toString());
        potoo.setTailInfo(new TailFalse());
        potoo.setHealthStatus(new MedicalHealthy());
        System.out.println("\nPotoo Bird - Update");
        System.out.println("Tail: " + potoo.getTailInfo());
        System.out.println("Health Status: " + potoo.getHealthStatus());
        
        // If you wish to see more examples then either use the animals created in order
        // or create your own Animal Class and test the program out
    }
}
