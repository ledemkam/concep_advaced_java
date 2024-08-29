package org.lab.designpatterns;

public class AnimalFactory {

    public static  Animal getAnimal(String type) {
        if (type.equals("cat")) {
            return new Cat();
        } else if (type.equals("dog")) {
            return new Dog();
        }
        return null;
    }
}
