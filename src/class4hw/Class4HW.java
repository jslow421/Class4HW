/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4hw;
import java.util.Scanner;

/**
 *
 * @author jslowik
 */
public class Class4HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager PaulMolitor = new Manager();
        Player BrianDozier = new Player();
        Scanner keyboard = new Scanner(System.in);
        
        BrianDozier.setNumber(2);
        BrianDozier.setBatHand("right");
        BrianDozier.setThrowHand("right");
        BrianDozier.setBattingAverage(.300);
        
        PaulMolitor.setNumber(4);
        PaulMolitor.setUsesSabermetrics(true);
        PaulMolitor.setWinLoss(.605);
       
        
        System.out.println("Pregame information for Brian Dozier");
        System.out.println("Number " + BrianDozier.getNumber());
        System.out.println("Batting hand " + BrianDozier.getBatHand());
        System.out.println("Throwing hand " + BrianDozier.getThrowHand());
        System.out.println("Batting Average " + BrianDozier.getBattingAverage());
        
        System.out.println("");
        
        System.out.println("Pregame information for Paul Molitor ");
        System.out.println("Number " + PaulMolitor.getNumber());
        System.out.println("Does he use Sabermetrics? " + PaulMolitor.isUsesSabermetrics());
        System.out.println("Win/Loss percentage " + PaulMolitor.getWinLoss());
        
        System.out.println("Who is playing the game? p for Paul, or b for Brian");
        String choice = keyboard.nextLine();
        
        if (choice.equals("b")){
            System.out.println("Brian Dozier has played a game!");
            BrianDozier.playGame();
            System.out.println("His new batting average is " + BrianDozier.getBattingAverage());
        }else if (choice.equals("p")){
            System.out.println("Paul Molitor has managed a game!");
            PaulMolitor.playGame();
            System.out.println("His new Win/Loss Percentage is " +
                    PaulMolitor.getWinLoss());
        } else{
            System.out.println("That was an invalid choice");
        }
        
    }
    
}
