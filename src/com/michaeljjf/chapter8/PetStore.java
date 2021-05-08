package com.michaeljjf.chapter8;

public class PetStore {
    public static Animal getAnimal(String petName) {
        Animal animal = null;
        switch (petName) {
            case "猫":
                animal = new Cat();
                break;
            case "狗":
                animal = new Dog();
                break;
        }
        return animal;
    }
}
