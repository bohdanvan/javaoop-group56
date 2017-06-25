package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex", "Bob");
        rex.bark(3);
        System.out.println("-----");

        Owner owner = new Owner("Bob", rex);
        owner.giveCommand();
        System.out.println("-----");

        Trainer trainer = new Trainer("Nick");
        trainer.trainDog(rex);
        trainer.trainDog(new Dog("Sharic"));
        trainer.trainDog(new Dog("Chack123"));

        trainer.giveCommand();
    }
}
