import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?");
    keyboard.nextInt();

    System.out.println( "Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();

    System.out.println( "Is there anything else you would like to say?");
    keyboard.next();
    // The program doesn't function properly when I type 3.14 as an answer to question 2
    // You can't use fractions such as 1/2 as an asnwer to question 3. Must be in decimal form
  }
}
