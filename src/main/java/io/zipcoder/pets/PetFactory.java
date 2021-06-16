package io.zipcoder.pets;

public class PetFactory {

    public static Pets createPets(String pet, String name) {
        if(pet.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (pet.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (pet.equalsIgnoreCase("parrot")) {
            return new Parrot(name);
        } else {
            return null;
        }
    }

}
//Another reason to employ an if/else statement, is in a factory method, where you create a new instance of a
//class, what class that is being based on which conditional statement is true