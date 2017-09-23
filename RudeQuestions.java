import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args) {
    String name, eyes;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();
    // My guess is that you cannot enter an integer in place of a String.
    // I was incorrect, I was able to enter 12 without the program blowing up.
    // Name prints out every symbol/number/decimal i could throw at it

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();
    // My guess is that it won't matter if I use an integer instead of a double.
    // It still functions when 185 is used, but prints out 185.0.
    // Wouldnt print decimals.

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();
    // Wouldn't print letters or symbols.

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();
    // Wouldn't print letters or symbols.

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    System.out.print("One more question. What color eyes do you have?");
    eyes = keyboard.next();

    System.out.println( eyes + "!"  + eyes + "is gross!");
  }
}
