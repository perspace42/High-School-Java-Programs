/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: arePrimeFactors
 *Purpose: Test if a list of random integers is prime, if they are test if all numbers within that list multiplied together
 are equal to a number provided by the user.
 */

import java.util.Random;
import java.util.Scanner;

public class arePrimeFactors{
  
//prints an integer array
public static void printArray(int[] a) {
  System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(",  " + a[i] + "  ");
      }   
  System.out.println("}");
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

//test if a given integer is prime
public static boolean isprime( int primenumber ){
    double primenumber_double = primenumber;
    for (int i = 1; i < primenumber+1; i++){
      if (primenumber/i != primenumber_double/i)
        return false;
    }
    return true;
    
    
  }

//check if all numbers within a list are prime and if all prime numbers within a list multiplied together are equal to a given number
public static boolean primelist(int[] primelist , int number){
    int multiple = 1;
    for (int i = 0; i < primelist.length; i++) {
      if (isprime(primelist[i]) == false){
        return false;
      }
      multiple = multiple * primelist[i];
      if (number == multiple){
        return true;
      }
    }
   return true;
  }
    
    
    
    
  //main loop
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //generate random list
    int[] randomlist = randomArray(1,3);//size, maxnum
    printArray(randomlist);
    //get user input
    System.out.println("Please enter a number:[then the program will test if all numbers in the list are prime and if multiplied together are = to that number]");
    int number = scan.nextInt();
    //output to terminal
    System.out.println(primelist(randomlist,number));
    scan.close();
  }
  
}
   