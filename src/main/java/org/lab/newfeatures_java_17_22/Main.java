package org.lab.newfeatures_java_17_22;

public class Main {

    //TODO: nouveuate en java 22

    public static void main(String[] args) {

        //text blocks : avec les 3 guillemets,permettent de mettre du code
        // sur plusieurs lignes automatiquement
        String query = """
                SELECT * FROM table
                WHERE column = 'value'
                """;

        //Records :
        // les records sont des classes qui sont immutables,ca veudt dire que
        // les valeurs(definit par le constructeur) ne sont pas modifiables,
        // on ne pourra donc pas faire des setters
           Person john = new Person("John", 30);
        System.out.println(john);

        //Pattern Matching :
        //Pattern Matching permet apres la creation d un object de verifier
        // son type et de definir une variable en meme temps

        var object = "hello";
        if (object instanceof String str) {
            System.out.println(str);
        }

    }
}
