package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants
int r;
int s;
boolean f;
  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
    //FIX THIS
    r=rank;
    s=suit;
    f=faceUp;
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
      if (f==true){
    return true;
      }
    else
    return false;
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
      f=faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return r;
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return s;
  }

  @Override
  public boolean equals(Object ob) {
    if (ob==this)
    return true;
    else 
    return false;
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
      int tot1=getRank()+getSuit();
      int tot2=c.getRank()+c.getSuit();
      if (tot1>tot2)
          return 1;
      else if (tot1==tot2)
              return 0;
      else
          return -1;                      
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      String rank;
       switch (getRank()){
      case 11: rank="Jack";
      break;
      case 12: rank="Queen";
      break;
      case 13: rank="King";
      break;
      case 14: rank="Ace";
      break;
      default: rank=""+getRank();
  }
       return (""+rank);
  }
  
  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
      String suit;
      switch (getSuit()){
      case 0: suit="Clubs";
      break;
      case 1: suit="Diamonds";
      break;
      case 2: suit="Hearts";
      break;
      case 3: suit="Spades";
      break;
      default : suit="?";
  }
      return ""+suit ;
  }
  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
      if (f==true)
    return getRankString()+ " of " + getSuitString();
      else
    return "?";//FIX THIS
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}