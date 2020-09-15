import java.util.Scanner;
/**
 * Puts numbers in ascending order
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user to enter the first integer
    System.out.println("Please enter an integer:");

    //declare and initialize variable to store integer one
    int integerOne = input.nextInt();

    //ask the user to enter the second integer
    System.out.println("Please enter another integer:");

    //declare and initialize variable to store integer two
    int integerTwo = input.nextInt();

    // checks to see what numbers are large
    if( integerOne > integerTwo ){
      System.out.println("Your numbers in ascending order are " + integerTwo + ", " + integerOne);
    } else if( integerOne < integerTwo){
    System.out.println("Your numbers in ascending order are " + integerOne + ", " + integerTwo);
    } else {
      System.out.println("Your numbers in ascending order are " + integerOne + ", " + integerTwo);
    }
    
    
  }
}
