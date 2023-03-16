/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Aproximate Exponent
 *Purpose: Print out the integer exponent (created by my function) and java exponent (Created by Math.pow) a number of times equal to a number inputed by the user
 */

import java.util.Scanner;
public class aprox_exponent{
  //my factorial function.
  public static double fact(double n){
    
    if (n == 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    return n * (fact(n-1));
          
  }
  //my exponent function.
  public static double myexp( double x, double n){
    
    double start = 1;
    while (n!=0){
      start = start + Math.pow(x, n) / fact(n);
      n=n-1;
    }
    return start;
    
  }
  
  //get the value from user input and then output the results.
  public static void check(double n){
    System.out.println(n+"\tMy exp: "+myexp(n,Math.pow(n,2))+"\tJava exp: "+Math.exp(n));
   
    }
  
  //format program output by line number user inputed.
  public static void table(double lines){
    double counter=1;
    //if only 1 line, check(1)
    if (lines==1){
      check(1);
    }
    //If the user has entered 0 or a negative number of lines, set lines = 1
    if (lines < 1){
      System.out.println("Error: " +lines+" Lines cannot be printed...assuming lines is 1");
      lines=1;
    }
    //loop to print out the exponent values of each integer up to the number of lines
    while (lines!=counter){
        check(counter);
        counter = counter+1;
      }
      //if lines == counter the end of the loop has been reached
      if (lines==counter){
        check(lines);
      }
  }
  
  //main loop
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How many lines should I print?");
    double input = scan.nextDouble();
    table(input);
    scan.close();
    
  }
    
 
    
}