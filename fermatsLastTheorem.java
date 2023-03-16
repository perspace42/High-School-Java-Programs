/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Fermats Last Theorem
 *Purpose: Create a function to check fermats last theorem
 The theorem states that no three positive integers (a,b,c) can satisfy the following equation: a^n + b^n = c^n
 (provided that n is any integer value greater than 2)
 */

import java.util.Scanner;
import static java.lang.Math.pow;

    
    
  public class fermats_last_theorem{
   //check if provided integer values of a,b,c & n conform to fermats last theorem 
   public static void checkFermat(int a, int b, int c , int n){
       //if the formula is followed and n > 2 then Fermat was wrong
       if (n > 2 && pow(a,n) + pow(b,n) == pow(c,n)){
         System.out.println("Holy smokes, Fermat was wrong!");
       
       //else Fermat was correct, print result along with the user inputs
       }else{
           
         System.out.println("No that doesn't work: " + a + "^" + n + " + " + b + "^" + n + " != " + c + "^" + n);
         }
       
     }
  //main loop
  public static void main(String[] args){
        //initialize variables
        int a;
        int b;
        int c;
        int n;

        //get user input
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter a value for a:");
        a = scan.nextInt();
         
        System.out.print("please enter a value for b:");
        b = scan.nextInt();
         
        System.out.print("please enter a value for c:");
        c = scan.nextInt();
         
        System.out.print("please enter a value for n:");
        n = scan.nextInt();
        
        //print result
        System.out.println("Checking a^n + b^n = c^n if n > 2 ...");
        checkFermat(a,b,c,n);

        //close scanner
        scan.close(); 
  }
 }

  