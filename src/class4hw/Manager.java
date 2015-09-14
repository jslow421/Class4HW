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
public class Manager implements Personnel{
    private int number;
    private boolean usesSabermetrics;
    private String gameInfo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isUsesSabermetrics() {
        return usesSabermetrics;
    }

    public void setUsesSabermetrics(boolean usesSabermetrics) {
        this.usesSabermetrics = usesSabermetrics;
    }
    
    @Override
    public String playGame(){
        gameInfo = "Manager number" + number;
        return gameInfo;
    }
    
}
