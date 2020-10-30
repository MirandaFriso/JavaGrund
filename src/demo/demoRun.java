
package demo;

import java.util.concurrent.ThreadLocalRandom;

public class demoRun {
    public static void main(String[] args) {
        
        //skapa spelkaraktär (thief) - göra en metod för detta senare.       
        Character t1 = new Thief(7, 5, 5, 7);
        t1.skill();
        System.out.println(t1.getInitiative());
        
        
        //kalla på attackmetod (gör metoden sen)
        
        //Bestäm turordning: kasta lika många tärningar som sitt initiativ
        int numberOfDice = 7; //endast för test nu
        int min = 1;
        int max = 7;  
        int diceTotalSum = 0;
        int diceResult = 0;

      //För varje tärning, skriv ut 'Tärningsresultat.
        for (int i = 0; i < numberOfDice; i++) { 
            diceResult = ThreadLocalRandom.current().nextInt(min, max);
            //System.out.println("Tärningsresultat: " + diceResult); 
            //Summan av alla tärningar
            diceTotalSum = diceTotalSum + diceResult;  
        }
        System.out.println(diceTotalSum);
    }
    
}
