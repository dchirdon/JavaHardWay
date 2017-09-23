public class ThereAndBackAgain {
  public static void main( String[] args) {
    System.out.println("Here.");
    erebor();
    // erebor; without the () won't compile becasue it is not a statement.
    System.out.println( "Back first time.");
    // erebor();
    // The program simply has one "There" on line 4.
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println( "There.");
  }
}
