package org.lab.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    //TODO: comment manipuler les dates en java

    public static void main(String[] args) {
        //lorsqu on veut manipuler une date :

         LocalDateTime inOneHour = LocalDateTime.now().plusHours(1);

        Duration duration = Duration.between(LocalDateTime.now(),inOneHour);

        System.out.println(duration.getSeconds()); //affiche la duree en seconde
    }
}
