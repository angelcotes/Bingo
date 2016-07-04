/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_virtual;

public class Letter {

    private String letter;
    private String number;

    public Letter(String letter, String num) {
        this.letter = letter;
        this.number = num;
    }

    public String getLetter() {
        return letter;
    }

    public String getNumber() {
        return number;
    }    
    
}
