package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
      System.out.print("House holds:\n");
      System.out.print(game.getHouseCards());
      System.out.print("You hold:\n");
      System.out.print(game.getYourCards());//FIX THIS
    }

  @Override
    public boolean hitMe() {
      Scanner scanner = new Scanner(System.in);   
       System.out.print("Another Card? y/n  ") ; //FIX THIS
       String in=scanner.next();
       while (!in.equals("y") && !in.equals("n")){
        System.out.print("You said " +in+ ". Please select y/n");
        in=scanner.next();
       }
       if (in.equals("y"))
        return true;
       else 
        return false;
    }
  @Override
    public void gameOver() {
        int yourscore=game.score(game.getYourCards());
        int housescore=game.score(game.getHouseCards());
      System.out.print("GAME OVER:\n");
      System.out.print("House holds:\n");
      System.out.print(game.getHouseCards());
      System.out.print("You hold:\n");
      System.out.print(game.getYourCards());
      System.out.print("House Score:"+ housescore);//FIX THIS
      System.out.print("\nYour Score:"+ yourscore+"\n");
      if (yourscore<=21 && yourscore!=housescore && (housescore>21 || yourscore>housescore))
          System.out.println("You win");
    else
                  System.out.println("The House wins");
    }
}
