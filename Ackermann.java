/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Ackermann
 *Purpose: Run the ackermann function using two integers (The ackermann function demonstrates that not every computible function is recursive)
 */
public class Ackermann {
  //Define ackermann function
  public static int ack(int m , int n){
        //If the first integer is 0
        if (m==0){
          //The second is equal to 0 + 1
          return n+1;
        }
        //If the first integer is greater than 0 and the second integer is equal to 0
        else if (m > 0 && n == 0){
          //Decrease the first integer by 1, set the second integer equal to 1, then recursively call the ack function
          return ack(m-1,1);
        }
        //If the first integer is greater than 0 and the second integer is greater than 0
        else if (m > 0 && n > 0){
          //Recursively call the ack function with the parameters of: (first integer - 1 , ack(first integer, second integer - 1))
          return ack(m-1,ack(m,n-1));
        }
        //Otherwise the ack function returns the second integer
        return n;
        
      }

//main loop
  public static void main(String[] args){
    System.out.println(ack(3,10));
  }
  
}
