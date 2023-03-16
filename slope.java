/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: slope
 *Purpose: Calculate the slope between two points, program continues until user enters 'N' when asked if the want to continue
 */

import java.util.Scanner;


public class slope{

public static void main(String[] args) {
    //Initialize while loop
    while (true) {
    //print blank line
    System.out.println("");
    //welcome message
    String Salutations="Slope Program Version 1.0.";
    System.out.println(Salutations);
    
    
    //initialize scanner & get x1 value for slope
    System.out.println("");
    double x1; //double means decimal
    System.out.println("Please enter x1:");
    Scanner scan = new Scanner(System.in);
    x1 = scan.nextDouble();
    
    //get x2 value for slope
    double x2;
    System.out.println("Please enter x2:");
    x2 = scan.nextDouble();
    
    //get y1 value for slope
    double y1;
    System.out.println("Please enter y1:");
    y1 = scan.nextDouble();
    
    //get y2 value for slope
    double y2;
    System.out.println("Please enter y2:");
    y2 = scan.nextDouble();

    //(variable.equals(VALUE))
    double x2MINUSx1 = x2 - x1;
    double y2MINUSy1 = y2 - y1;
    double slope = x2MINUSx1 / y2MINUSy1; 

    System.out.println("The Slope is: " + slope);

    Print_Name=false;

    System.out.println("Continue? ( y or n )");
    char answer;
    //program will continue whether yes or y is inputed
    answer = scan.next().charAt(0);
    
    //scan.next().charAt(0) scans the character for index 0 which is+ //+y in cases of yes and y
    if (answer != 'y') {
      //close scanner  
      scan.close();
      //break will close the program
      break;
    }
   }
  }
}

