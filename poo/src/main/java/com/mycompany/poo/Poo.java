package com.mycompany.poo;

import characters.Character;  //importamos el paquete
        
public class Poo {

    public static void main(String[] args) {
        Character homero = new Character ("Homero", "Inspector de seguridad", 33, "A la grande le puse cuca" );
        homero.greeting();
        System.out.println(homero.getAge());
        
        Character bart = new Character ();
        bart.setPhrase("Ayyy caramba!!!");
        bart.greeting();
    }
}
