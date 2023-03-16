/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: GuessGame
 *Purpose: Create a guessing game where the user has one attempt to guess a number between 0 and 100
 */


import java.util.Random;
import java.util.Scanner;
  public class GuessGame{
  public static void main(String[] args){
    
    //initialize variables
    int guess = 0;

    //get user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number:");
    guess = scan.nextInt();
    
    //get random number to be guessed between 0 and 100
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    // 1 is added because 100 is the stop value so 100 is really 0 to 99.
    
    System.out.println("You guessed: " + guess);
    System.out.println("The correct number was:" + " " + number);
    
    if (guess==number){
      System.out.println("Yay you got the correct answer");
    }
    //close scanner
    scan.close();
      
    
    
  }
  
}