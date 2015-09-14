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
public class Mascot extends Player{
    private boolean hasHat;

    public boolean isHasHat() {
        return hasHat;
    }

    public void setHasHat(boolean hasHat) {
        this.hasHat = hasHat;
    }
    
    public void playGame(){
        hasHat = false;
    }
}
