/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.claseufpso.programacionii;

/**
 *
 * @author SCIS2PC30
 */
public class ProgramacionII {

    public static void main(String[] args) {
        Character homero = new Character("homero", 39, 'm', "hola" );
        homero.saySomething();

        Character bart = new Character ()
    }
    static class Character {
        String name;
        int age;
        char gender; 
        String phrase;

        public Character(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            
        }

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }
        
    }
    
    void saySomething (){
        System.out.println();
        
    }
    
    
    
}

