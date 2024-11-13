//Ryan Jukes
//11-12-24
//AT Java 
//Unit 05 Project 

import java.util.Random;
public class Card {

    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }
    
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Suit cSuit; 
    private Rank cRank;

    public Card() {
        
    }
}