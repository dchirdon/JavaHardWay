import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args) {
    // This code is broken until you fix it.
    // Program will not compile with price declared but not defined
    // salesTax and total variables must be moved to after "price" has a definite value for the program to perform properly

    Scanner keyboard = new Scanner(System.in);
    double price = 0, salesTax, total;

    System.out.print("how much is the purchase price?");
    price = keyboard.nextDouble();
    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println("Item price:\t" + price);
    System.out.println("Sales tax:\t" + salesTax);
    System.out.println("Total cost:\t" + total);
  }
}
