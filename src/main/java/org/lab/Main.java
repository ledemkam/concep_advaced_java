package org.lab;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
       //Todo: Fichier et Serialisation

        //Ficher

        Path path = Paths.get("example.txt");//generer un path(chemin) afin d utliser pour creer un fichier
        List<String> lines = List.of("First line", "second line");
        Files.write(path,lines, StandardCharsets.UTF_8);

        //Serialisation

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        Person john = new Person("John", 30, "X9qFP@example.com");
        out.writeObject(john);//on l ecrit dans le fichier person.ser(comme c est un object on l ecrit avec writeObject)

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        try {
            Person person = (Person) in.readObject();
            System.out.println(person.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}