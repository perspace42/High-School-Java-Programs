/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Iterative Take To Power
 *Purpose: Prompt two doubles from the user then take the first double to the power of the second number using iteration
 */
import java.util.Scanner;

public class iterative_power{
  public static void main(String[] args){
  //initialize variables
  double num = 0;
  double power = 0;
  double result = 0;
  //get user input
  Scanner scan = new Scanner(System.in);

  //get the initial number form the user
  System.out.println("Please enter a number:");
  num = scan.nextDouble();
  //get the number to take the first number to the power of
  System.out.println("That number will be taken to the power of:");
  power = scan.nextDouble();

  //Any number to the power of 1 is itself
  if (power == 1){
    System.out.println(num);
    
  }
  //Any number to the power of 0 is one
  if (power == 0){
    System.out.println(1);
    power = 1;
  }

  result=num;

  //take the first number to the power of the second number
  while (power!=1 && power!=0){
    
    result = result*num;
    power=power-1;
  }
  //print the result
  System.out.println(result);
  //close scanner
  scan.close();
  
  }
  
}
  
    
    
    