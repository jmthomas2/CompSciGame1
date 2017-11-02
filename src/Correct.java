/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katalbert
 */
public class Correct {
    private Person person;
    private int fillColor;
    private int xLoc;
    private int yLoc;
    
    public Correct (Person person, int fillColor, int xLoc, int yLoc) {
        this.person = person;
        this.fillColor = fillColor;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    
    public void showColor () {
        //make it green
    }
    
    public void movePerson () {
        person.move (xLoc, yLoc);
    }
}
