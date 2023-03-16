/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: areFactors
 *Purpose: Test if a list of random integers is evenly factorable by a given number. The given number, 
 random number list length, and max size of a number within the random list is provided by the user
 */

import java.util.Scanner;
import java.util.Random;
public class areFactors{

//function to print an integer array
public static void printArray(int[] a) {
  System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(",  " + a[i] + "  ");
      }   
  System.out.println("}");
}

//function checks if number is evenly divisible by multiple
public static boolean Ismultiple( int number , int multiple){
   double number_copy = number;
   if (number_copy/multiple == number/multiple && number!=0){
     return true;
   }
   return false;
}

//function tests if each item within numlist is evenly factorable by number
public static boolean factor_all(int[] numlist , int number){
  for (int i=0; i < numlist.length; i++){
    if (Ismultiple(numlist[i],number)==false){
      return false;
    }
  }

 return true;
}

//generate a list of random numbers each with a value less than or equal to maxum, the list will also have a length equal to size.
public static int[] randomArray(int size , int maxnum) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(maxnum+1);
    }
    return a;
}

//main loop
public static void main(String[] args){
    //intialize variables
    int length = 0;
    int number = 0;
    int maxnum = 0;

    //get user input
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a number to factor the random list by:");
    number = scan.nextInt();
    
    System.out.println("Please enter the length of the random list:");
    length = scan.nextInt();
    
    System.out.println("What do you want the max number in the random list to be:");
    maxnum = scan.nextInt();
    
    //initialize list of random numbers using user input
    int[] numberlist = new int[length];
    numberlist = randomArray(length,maxnum);
    //print output
    System.out.println(number + " is factorable by randomlist below evaluates to: " + factor_all(numberlist , number));
    printArray(numberlist);
    scan.close();
  }
}