import java.util.Scanner;


/**
* Contains functions that make it easier to work with months.
*/
public class ThirtyDaysFunctions {
  public static void main( String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.print( "Which month? (1-12)");
    int month = kb.nextInt();

    System.out.println(monthDays(month) + " days hath " + monthName(month));
  }

  /**
  * Returns the name for the given month number (1-12).
  *
  * @Author David Chirdon
  * param month the month number (1-12)
  * @ Return    the English name of the month, or error if out of Rectangle
  */
  public static String monthName( int month ) {
    String monthName = "error";

    if (month == 1)
      monthName = "January";
    else if (month == 2)
      monthName = "March";
    elseif(month==4)
      monthName = "April";
    elseif(month==5)
      monthName = "May";
    elseif(month==6)
      monthName = "June";
    elseif(month==7)
      monthName = "July";
    elseif(month==8)
      monthName = "August";
    elseif(month==9)
      monthName = "September";
    elseif(month==10)
      monthName = "October";
    elseif(month==11)
      monthName = "November";
    elseif(month==12)
      monthName = "December";

    return monthName;
  }

    public static int monthDays( int month ) {
      int days;
      switch(month)
    }
      case 9:
      case 4:
      case 6:
      case 11: days = 30;
            break;
      case 2: days = 28;
            break;
      default: days = 31;
    }

    return days;
  }
}
