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
public class Player implements Personnel {
    private int number;
    private String batHand;
    private String throwHand;
    private double battingAverage;
    private String gameInfo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBatHand() {
        return batHand;
    }

    public void setBatHand(String batHand) {
        this.batHand = batHand;
    }

    public String getThrowHand() {
        return throwHand;
    }

    public void setThrowHand(String throwHand) {
        this.throwHand = throwHand;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }
    
    @Override
     public String playGame(){
        gameInfo = "Test";
        return gameInfo;
    }
    
    
}
