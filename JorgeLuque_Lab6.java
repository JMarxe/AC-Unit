/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgeluque_lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class JorgeLuque_Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of units:");
        Scanner scanner = new Scanner(System.in);
        final int SIZE = scanner.nextInt();
        String [] unitStatus = new String[SIZE];
        int [] unitCredit = new int[SIZE];
        System.out.println("Enter the number of hours:");
        final int HOURS = scanner.nextInt();
        Random randGenerator = new Random();
        /*use a for each to show you how to loop through the unitCredit array in
        an interesting and shorter manner.*/
        for(int i = 1; i < HOURS + 1; i++){
            int randomStop = randGenerator.nextInt(SIZE + 1);
            System.out.println("In hour " + i + " we need to shut down " + randomStop + " units:");
            
            for(int a = 0; a < SIZE; a++){
            unitStatus [a] = "ON";
            }
            
            for(int b = 0; b < randomStop; b++){
            unitStatus [b] = "OFF";
            unitCredit [b]++;
            }
            
            for(int a = 0; a < SIZE; a++){
                System.out.println("    Unit " + a + " is " + unitStatus [a] + " with random credits:   " + unitCredit [a]);
            }
        //shorter for each
        
//        for(int i = 0; i < SIZE; i++){
//            System.out.println("Unit Credit: " + unitCredit[i]);
//        }
//        //longer for loop
//        //Notice that for loops and arrays go hand in hand.
        
        }
    
    }
}
