package helloworld;

import java.util.ArrayList;
import java.util.List;


public class ArreglosDinamicos {

    public static void main(String[] args) {
        List<String> animales = new ArrayList<>();
        animales.add("Leon");
        animales.add("perro");
        animales.add("gato");
        animales.add("oso");
        
        System.out.println("Animales "+animales);
        animales.add(2,"Tigre");
        System.out.println("Animales "+animales);
        animales.remove(1);
        System.out.println("Animales "+animales);
    }
    
}
