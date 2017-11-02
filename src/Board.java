/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katalbert
 */
public class Board {
    //create the tile thing
    private Tile[][] board;
    private Person p;
    
    public Board (Person p) {
        board = new Tile [6][6];
        this.p = p;
        //make the randomized pattern
    }
    
    public void execute (int r, int c) {
        board [r][c].showColor();
        if (board[r][c].getIsCorrect())
            p.move();
        else
            p.die();
    }
}
