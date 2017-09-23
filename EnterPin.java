import java.util.Scanner;

public class EnterPin {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String enter = "pass", password;

    pin = 12345;

    System.out.println("Welcome to the Bank of Java!");
    System.out.print("ENTER YOUR PASSWORD: ");
    password = keyboard.next();

    if (password.equals(enter)) {
      System.out.println("\nPASSWORD ACCEPTED.");
    }

    else while (! password.equals(enter)) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      password = keyboard.next();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
