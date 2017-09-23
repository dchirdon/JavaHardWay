import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main( String[] args) {
    printTopHalf();

    print41Colons();
    print41Ohs();
    print41Colons();
    print41Ohs();
    print41Colons();
    print41Ohs();
    printPledge(); // Program now prints the Pledge of Allegiance at the bottom
  }

  public static void print41Colons() {
    out.println( "|:::::::::::::::::::::::::::::::::::::::::|");
  }

  public static void print41Ohs() {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons() {
    out.println( "|:::::::::::::::::::::::::::::|" );
  }

  public static void printPledge() {
    out.println( "I pledge allegiance to the flag." );
  }

  public static void print29Ohs() {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print6Stars() {
    out.print("|* * * * * *");
  }

  public static void print5Stars() {
    out.print("| * * * * * ");
  }

  public static void printSixStarLine() {
    print6Stars();
    print29Ohs();
  }

  public static void printFiveStarLine() {
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf() {
    out.println( " _________________________________________" );
    // the line above has 1 space then 48 underscores between the quotes
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }
}
