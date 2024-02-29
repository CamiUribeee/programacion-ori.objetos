/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.claseufpso.programacionii;
import people.Character;

/**
 *
 * @author SCIS2PC30
 */
public class ProgramacionII {

    public static void main(String[] args) {
        Character homero = new Character("homero", 39, 'm', "hola" );
        homero.saySomething();

        Character bart = new Character("bart", 10, ',', "hola" );
        bart.saySomething();
        
        Character apu = new Character();
        apu.setName("apu");
        apu.setName("vuelvas prontos");
    }
    

    
    
    
    
}

