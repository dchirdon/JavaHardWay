import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double inches, lbs, bmi, ft;

    System.out.print( "Your height in ft: ");
    ft = keyboard.nextDouble();
    System.out.print("Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    bmi = (lbs*0.454) / ((ft*0.305 + inches*0.025)*(ft*0.305+inches*.025));

    System.out.println( "Your BMI is " + bmi);
  }
}
