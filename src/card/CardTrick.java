/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * ICE 1 - Card Trick
 * Modifier: Manpreet Singh (991791559)  
 *
 */
public class CardTrick {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        // 1) build the "magic hand"
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);       // 1..13 (Ace=1, J=11, Q=12, K=13)
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Hearts, Diamonds, Clubs, Spades
            magicHand[i] = c;
        }

        // show the hand (helps you see what's happening)
        System.out.println("Magic hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        // 2) ask user for a card
        System.out.print("\nEnter a card value (1-13): ");
        int v = in.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int sIndex = in.nextInt();
        String s = Card.SUITS[sIndex];

        // 3) search
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == v && c.getSuit().equals(s)) {
                found = true;
                break;
            }
        }

        // 4) report
        if (found) {
            System.out.println("Great! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
