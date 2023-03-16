/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Evenly Divisible
 *Purpose: Use user input of two integers to determine if the first integer is evenly divisible by the second integer.
 */

import java.util.Scanner;
public class isDivisible{
  //Test if integer n is evenly divisible by integer m.
  public static boolean divisible(int n, int m){
    double v = n;
    double b = m;
    if (v/b==n/m){
      return true;
    }else{
      return false;
    }
  }
  
  
  //main loop
  public static void main(String[] args){
    //initialize variables
    boolean answer;
    int n;
    int m;

    //get user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a integer.");
    n = scan.nextInt();
    System.out.println("Please enter a integer for the previous integer to be divided by.");
    m = scan.nextInt();

    //output results
    answer = divisible(n,m);
    System.out.println(answer);

    //close scanner
    scan.close();
    
    
    
    
  }
}