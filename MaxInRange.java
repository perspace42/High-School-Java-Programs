/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: MaxInRange
 *Purpose: Prompt for two integers from the user, then search a list of randomly generated integers for all numbers between those integers
*/

import java.util.Scanner;
import java.util.Random;

public class MaxInRange{

  //prints an integer array
  public static void printArray(int[] a) { 
  System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(",  " + a[i] + "  ");
      }   
  System.out.println("}");
}
  
  
  //create a random array that has a length of size and only contains integers with a value up to maxnum
  public static int[] randomArray(int size , int maxnum) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(maxnum+1);
    }
    return a;
}
 
 
//check if there is a number between lowIndex and highIndex within an integer list
public static int maxInRange( int[] list, int lowIndex , int highIndex){
  int greatestnum = 0;
  int iterated = 0;
    for (int i = 0; i < list.length; i++)
        if (list[i] > greatestnum && list[i] > lowIndex && list[i] < highIndex){
           greatestnum = list[i];
           iterated = 1;
        } 
    if (iterated!=1){
      System.out.println("There was no number in between " + lowIndex + " and " + highIndex);
    }
  return greatestnum;
 } 
  
 //main loop
  public static void main(String[] args){
    //get user input
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter a low index.");
    int low_index = scan.nextInt();
    System.out.println("Please enter a high index.");
    int high_index = scan.nextInt();
    
    System.out.println("Scanning for highest number in list in between low index and high index");
    int[] randomlist = randomArray(10 , 25); //(size , maxnum)
    printArray(randomlist);
    System.out.println(maxInRange(randomlist,low_index, high_index));
    scan.close();
  }
  
  
  
  
   
}