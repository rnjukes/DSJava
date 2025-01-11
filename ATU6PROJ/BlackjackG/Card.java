package BlackjackG;

import java.util.Random;
public class Card {

        static char spade = '\u2660'; 
        static char diamond = '\u2662'; 
        static char heart = '\u2661'; 
        static char club = '\u2663';

    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }
    
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Suit cSuit; 
    private Rank cRank;

    public Card() {
       Random rand = new Random(); 
       cSuit = Suit.values()[rand.nextInt(Suit.values().length)];
       cRank = Rank.values()[rand.nextInt(Rank.values().length)];
    }

    public Card(Suit asuit, Rank arank) {
        cSuit = asuit;
        cRank = arank;
    }

    public Suit getSuit() {
        return cSuit;
    }

    public Rank getRank() {
        return cRank;
    }

    private char getRankCh(Rank rank) {
        if (rank ==Rank.TWO) {
            return '2';
        } 
        if (rank ==Rank.THREE) {
            return '3';
        } 
        if (rank ==Rank.FOUR) {
            return '4';
        } 
        if (rank ==Rank.FIVE) {
            return '5';
        }  
        if (rank ==Rank.SIX) {
            return '6';
        }  
        if (rank ==Rank.SEVEN) {
            return '7';
        }  
        if (rank ==Rank.EIGHT) {
            return '8';
        } 
        if (rank ==Rank.NINE) {
            return '9';
        }  
        if (rank ==Rank.TEN) {
            return 'T';
        } 
        if (rank ==Rank.JACK) {
            return 'J';
        }  
        if (rank ==Rank.QUEEN) {
            return 'Q';
        }  
        if (rank ==Rank.KING) {
            return 'K';
        } 
        if (rank ==Rank.ACE) {
            return 'A';
        } 
        return '?' ;
    }

     private char getSuitCh(Suit suit) {
        if (suit ==Suit.SPADE) {
            return spade;  
        }
        if (suit ==Suit.CLUB) {
            return club;  
        }
        if (suit ==Suit.DIAMOND) {
            return diamond;  
        }
        if (suit ==Suit.HEART) {
            return heart;  
        }
        return '?' ;
    } 

    public String getFace() { 
        char rankVal = getRankCh(cRank);
        char suitVal = getSuitCh(cSuit);
            return ""+suitVal+rankVal;
    }
}