/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: OddSum
 *Purpose: The user enters an integer, that integer is then increased by the sum of all odd integers from 1 to n
 */

import java.util.Scanner;
public class oddsum {

  //test if a provided integer is odd
  public static boolean isOdd(int n){
    double v = n;
    //if integer division is equal to decimal division then the number is not even, else it is even
    if (v/2==n/2){
      return false;
    }else{
      return true;
    }
  }
  
  //add all odd integers below n, to n (stopping at 1)
  public static int Oddsum(int n){
      
        if(n == 0){
            return n;
        }
        if (n == 1) {
            return 2;
        }
        if (false==isOdd(n)){
          return Oddsum(n-1);
        }
        if (n<3){
          return n;
        }else{
          return n + Math.abs((Oddsum(n-2)));
          
        }
           
        
   }
  
//main loop
  public static void main(String[] args){
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter integer n, n will be increased by the sum of all odd intergers from 1 to n:");
    n = scan.nextInt();
    int result = Oddsum(n);
    System.out.println(result);
    scan.close();
    
 }
}
        