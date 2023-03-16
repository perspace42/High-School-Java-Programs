/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Celsius To Farenheit
 *Purpose: Convert an entered Celsius Temperature to Farenheit
 */

import java.util.Scanner;
public class CtoF {

public static void main(String[] args){
      //initialize variables
      double F = 0;
      double C = 0;
      //get user input
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a Celsius temperature and I will convert it to Farenheit:");
      //calculate result
      C = scan.nextDouble();
      F = C*9/5+32;
      //print result to terminal
      System.out.println(F);
      scan.close();
  }
}
