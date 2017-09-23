public class CreatingVariables {
  public static void main( String[] args) {
    int x, y, z, age;
    double seconds, e, checking, f;
    String firstName, lastName, title, occupation, eyeColor;

    x = 10;
    y = 400;
    z = 30;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    f = 5.81;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    occupation = "Plumber";
    eyeColor = "Brown";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "Variable Z is equal to " + z );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "f has a randomly chosen value of" + f );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName + " and I am a " + " " + occupation + " with" + " " + eyeColor + " eyes.");
  }
}
