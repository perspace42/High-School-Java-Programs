/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: ToAPowerRecursive
 *Purpose: Using recursion take the first number to the power of a second number
 */


public class Lastrecurse{
  //function to take x^n
  public static double power(double x, int n){
    if (n!=1){
    return x*power(x,n-1);
    }
    if (n==0){
      return 1;
    }
    if (n==1){
      return x;
    }
    return x;
    
    
  }
  //main loop
  public static void main(String[] args){
    System.out.println(power(2,5));
    
  }
  
  
  
}