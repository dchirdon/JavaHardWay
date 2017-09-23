import java.util.Scanner;

public class WeaselOrNot {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please.");
    word = keyboard.next();

    yep  =   "weasel".equals(word);
    nope = ! word.equals("weasel");
    // Placing the word "weasel" before the dot and "word" after, works equally well
    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );
  }
}
