/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Raise_By_Power_BigInteger
 *Purpose: Print a number raised to the power of a second number
 */

import java.math.BigInteger;//normal upper integer limit is: 2,147,483,648 
public class BigInt_power{
  //function to raise x by the power of n
  public static BigInteger pow(int x, int n) {
   
    BigInteger one = BigInteger.valueOf(1);
    
    //any number to the 0 power is 1
    if (n == 0){ 
      return one;
    }
    
    //multiple x by itself n times
    int stepper = x;
    for (int i = 0; i<n-1; i++){
       stepper = stepper*x;
    }
    //set return varaible then return it
    BigInteger b_t = BigInteger.valueOf(stepper);
    return b_t;
}

  //main loop
  public static void main(String[] args){  
    System.out.println(pow(2,3));
  }
}
  