/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4hw;

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
        
        BrianDozier.setNumber(2);
        BrianDozier.setBatHand("right");
        BrianDozier.setThrowHand("right");
        BrianDozier.setBattingAverage(.300);
        
        
        System.out.println(BrianDozier.getNumber());
        System.out.println(BrianDozier.getBatHand());
        System.out.println(BrianDozier.getThrowHand());
        System.out.println(BrianDozier.getBattingAverage());
        
        
        PaulMolitor.playGame();
        
    }
    
}
