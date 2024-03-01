package com.mycompany.poo;

public class Poo {

    public static void main(String[] args) {
        Character homero = new Character ("Homero", "Inspector de seguridad", 33, "A la grande le puse cuca" );
        homero.greeting();
        System.out.println(homero.age);
        
        Character bart = new Character ("Bartolomeo", "Vago", 10, "Ayyyy caramba!!!" );
        bart.greeting();
    }
    static class Character {
        //Propiedades objetos
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {  //alt - insert sale constructor automatico
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        
        
         //void para no retornar a ningun valor
        void greeting (){
            System.out.println(this.phrase);
        }
    }
}
