/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;


public class Card {
    private String suit;         // Hearts, Diamonds, Clubs, Spades
    private int value;           // 1..13 (Ace=1, J=11, Q=12, K=13)

    // Make the suits available to other classes
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
