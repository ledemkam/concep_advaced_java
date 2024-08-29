package org.lab.designpatterns;

public class Main {

    public static void main(String[] args) {

       Database db = Database.getInstance();

       //test Factory
       Animal sparky = AnimalFactory.getAnimal("dog");
       sparky.scream();
       Animal russo = AnimalFactory.getAnimal("cat");
       russo.scream();
    }

}
