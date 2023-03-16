/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Factorial_With_BigInteger
 *Purpose: Print the factorial of the first 30 integers.
 */

import java.math.BigInteger;//normal upper integer limit is: 2,147,483,648 
public class BigInt_factorial{
  //factorial function
  public static void fact(int n){
    BigInteger number = BigInteger.valueOf(n);
    BigInteger result = BigInteger.valueOf(n);
    BigInteger zero   = BigInteger.valueOf(0 );
    BigInteger one    = BigInteger.valueOf(1 );

    //set while loop to calculate facotrial
    while ( number.subtract( one ) != zero ){
      number = number.subtract( one );
      result = result.multiply(number);
      }
    //if the result is less than 10 print with an extra space
    if (n<10){
       System.out.println(" " + n + "!   :   " + result);
    }
    //if the result is greater than 9 print without an extra space
    if (n>9){
       System.out.println(n + "!   :   " + result);
    }
  }

  //main loop
  public static void main(String[] args){
    for (int i = 1; i<31; i++){
      fact(i);
    }
  }
}
   

