/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katalbert
 */
public class Tile {
    private boolean isCorrect;
    private int xLoc;
    private int yLoc;
    
    public Tile (int xLoc, int yLoc, boolean isCorrect) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.isCorrect = isCorrect;
    }
    
    public boolean getIsCorrect () {
        return isCorrect;
    }
    
    public void showColor () {
        //change image
    }
    
}
