/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doggenetics;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author Isaac Shadare
 */
public class DogGenetics{
    public static void main(String []args){
        int Ber = 0, Chi = 0, Darm = 0, Com = 0, Kin = 0, total = 0;
        String dogs_name;
        Scanner User_input = new Scanner(System.in);
        System.out.println("What is your dog's name? ");
        dogs_name = User_input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " 
                + dogs_name + "'s prestigious background right here.");
        System.out.println("\n" + dogs_name + " is:\n");
        Random random = new Random();                
        while(total != 100)
        {
            Ber = random.nextInt(100);
            Chi = random.nextInt(100-Ber);
            Darm = random.nextInt(100-Chi);
            Com = random.nextInt(100-Darm);
            Kin = random.nextInt(100-Com);
            total = Ber + Chi+ Darm + Com + Kin;
        }
        System.out.println(Ber + "% St. Bernard");
        System.out.println(Chi + "% Chihuahua");
        System.out.println(Darm + "% Dramatic RedNosed Asian Pug");
        System.out.println(Com + "% Common Cur");
        System.out.println(Kin + "% King Doberman");
        System.out.println("\nWow, that's QUITE the dog!");

        
        
        
    }
    
}
