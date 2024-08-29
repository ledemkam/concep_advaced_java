package org.lab.designpatterns;

//example design pattern singleton
public class Database {

    private static  Database instance;//static est utilise pour lier l attribut instance a la classe Database,
                      // pour que l attribut instance soit accessible partout dans la classe Database sans etre instancie par la classe Database


    private  Database() {
    }

     //pour pouvoir acceder a cet instance  on utlisera une fonction public

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
