//Ryan Jukes
//1-13-24
//AT Java Blackjack Project 

import BlackjackG.Card;
import java.util.ArrayList;
import java.util.Scanner; 

public class JukesBlackjack {

    private static int cardValue(Card.Rank rank) {
        if (rank == Card.Rank.TWO) {
            return 2;
        }
        if (rank == Card.Rank.THREE) {
            return 3;
        }
        if (rank == Card.Rank.FOUR) {
            return 4;
        }
        if (rank == Card.Rank.FIVE) {
            return 5;
        }
        if (rank == Card.Rank.SIX) {
            return 6;
        }
        if (rank == Card.Rank.SEVEN) {
            return 7;
        }
        if (rank == Card.Rank.EIGHT) {
            return 8;
        }
        if (rank == Card.Rank.NINE) {
            return 9;
        }
        if (rank == Card.Rank.TEN) {
            return 10;
        }
        if (rank == Card.Rank.JACK) {
            return 10;
        }
        if (rank == Card.Rank.QUEEN) {
            return 10;
        }
        if (rank == Card.Rank.KING) {
            return 10;
        }
        if (rank == Card.Rank.ACE) {
            return 11;
        } else {
            return 0;
        }
    }

  private static int handValue(ArrayList<Card> hand) {
    int trueValue = 0;
    int aces = 0;
    for (Card x : hand) {
        trueValue += cardValue(x.getRank());
        if (x.getRank() == Card.Rank.ACE) {
            aces++;
        }
    }
    while (trueValue > 21 && aces > 0) {
        trueValue -= 10;
        aces--;
    }
    return trueValue;
}

 public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    boolean game = true; 

    System.out.printf("Blackjack game...\n");
    System.out.println("Would you like to play?");

    while (game) {
        String rtqone = in.nextLine().toLowerCase();
        if (rtqone.equals("yes")) {
            fullGame(in);
        } else if (rtqone.equals("ye")) {
            fullGame(in);
        } else if (rtqone.equals("y")) {
            fullGame(in);
        } else {
          System.out.println("Hope to see you again soon!");
        in.close();  
        } }
    } 

    
    private static void fullGame(Scanner in) {
        System.out.println();
        boolean pUp = true;
        boolean dUp = false;
        String hiddencard = "🂠";      

        ArrayList<Card> phand = new ArrayList<>();
        ArrayList<Card> dhand = new ArrayList<>();

        phand.add(new Card());   phand.add(new Card());
        dhand.add(new Card());   dhand.add(new Card());
     
        System.out.printf("Dealer hand: \n"+dhand.get(0).getFace()+" "+hiddencard+"\n\n");
        System.out.printf("Player hand: \n"+phand.get(0).getFace()+" "+phand.get(1).getFace()+"\n");
        
        int z = 0;
        Card az = dhand.get(0);        
        z += cardValue(az.getRank()); 

        if (z == 10 || z == 11) {
        if (handValue(dhand) == 21) {
                System.out.println("The dealer checked their hiddden card and has blackjack");
                pUp = false;
                dUp = false;
            } else {
                System.out.println("The dealer checked their hidden card and does not have blackjack");
            }
        }

        while (pUp) {
            int pScore = handValue(phand);
            if (pScore > 21) {
                System.out.println("Unlucky! You busted!");
                pUp = false;
                break;
            } else if (pScore == 21) {
                System.out.println("You have blackjack!");
                pUp = false;
                dUp = false;
                break;
            }

            System.out.println("You have "+pScore);
            System.out.println("Hit or stand (h/s): ");
            String act = in.nextLine().toLowerCase();

            if (act.equals("h")) {
                Card hitCard = new Card();
                phand.add(hitCard);
                for (Card card : phand) {
                    System.out.print(card.getFace() + " ");
                } 
                System.out.println();
            } else if (act.equals("s")) {
                pUp = false;
                dUp = true;
                System.out.println();
                System.out.println("It is now the dealer's turn");
            } else {
                System.out.println("Invalid input");
            }
        }

        while (dUp) {
        int dScore = handValue(dhand); 
        if (dScore > 21) {
            System.out.println("The dealer busted!");
            dUp = false;
            break;
        }
        if (dScore >= 17) {
            dUp = false;
        } else {
            dhand.add(new Card());
        }
        }

        System.out.print("The dealer's final hand was ");
            for (Card card : dhand) {
                    System.out.printf(card.getFace() + " ");
                }
                System.out.println();
        System.out.println("The dealer had "+handValue(dhand));
        
        if (!dUp) {
            int endpscore = handValue(phand);
            int enddscore = handValue(dhand);

            if (endpscore > 21) {
                System.out.println("Dealer wins...");
            } else if (enddscore > 21) {
                System.out.println("You win!");
            } else if (endpscore > enddscore) {
                System.out.println("You win!");
            } else if (enddscore > endpscore) {
                System.out.println("Dealer wins...");
            }
            
            else {
                System.out.println("The hand is a push!");
            }
        
        }
        System.out.println("Play again?");
            }
        } 
   