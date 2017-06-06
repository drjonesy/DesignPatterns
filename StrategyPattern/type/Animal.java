package StrategyPattern.type;

import StrategyPattern.composition.MedicalBehavior;
import StrategyPattern.composition.TailBehavior;

public class Animal {
    private String location;
    private String breed;
    private char gender;
    private int age;
    private double size;
    
    //constuctors
    public Animal() {
    }

    public Animal(String location, String breed, char gender, int age, double size) {
        this.location = location;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
     
    }
    
    //composition
    TailBehavior tailBehavior;
    MedicalBehavior medicalBehavior;
    
    //composition methods
    //--Tail (has / does not have)
    public boolean getTailInfo(){ return tailBehavior.Tail(); }
    public void setTailInfo(TailBehavior tb){ tailBehavior = tb; }
    //--Medical (healthy / sick)
    public String getHealthStatus() {return medicalBehavior.healthStatus();}
    public void setHealthStatus(MedicalBehavior mb) { medicalBehavior = mb; }
    
    //setters
    public void setLocation(String location){ this.location = location; }
    public void setBreed(String breed) { this.breed = breed; }
    public void setGender(char gender) { this.gender = gender; }
    public void setAge(int age) { this.age = age; }
    public void setSize(double size) { this.size = size; }
   
    
    //getters
    public String getLocation() { return location;}
    public String getBreed() { return breed; }
    public char getGender() { return gender; }
    public int getAge() { return age; }
    public double getSize() { return size; }
    
    @Override
    public String toString(){
        return "\nAnimal Info:" 
                + "\n> Current Location: " + this.location
                + "\n> Breed: " + this.breed 
                + "\n> Gender: " + this.gender
                + "\n> Age: " + this.age
                + "\n> Size: "  + this.size + " cm"
                + "\n-- Additional Info --"
                + "\n> Tail: " + getTailInfo()
                + "\n> Health Status: " + getHealthStatus();
    }
   
    
}
