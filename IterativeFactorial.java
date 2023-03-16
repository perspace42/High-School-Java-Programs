/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Factorial Iterative
 *Purpose: Prompt an double from the user then multiply that double by all numbers below it that are greater than 0,
 then return the resulting number.
 */
import java.util.Scanner;
public class iterative_factorial{
  public static void main(String[] args_){
    //initialize variables
    double number = 0;
    double result = 0;
   
    //get user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter n and n will be multiplied by all numbers below it greater than 0 .");
    number = scan.nextDouble();
    scan.close();
    
    //initialize result
    result = number;
    //multiply result by every number below it greater than 0
    while (number >1){
      number = number - 1;
      result = result * number;
      
      
    }
    //output result
    System.out.println(result);
    
    
    
  
  }
}