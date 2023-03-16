/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Sieve of Erastosthenes
 *Purpose: Use the sieve of erastosthenes to find the first 1000 prime numbers
 */
public class sieve_of_eratosthenes{
 
  public static void printArray(int[] a) { //prints an integer array
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(",  " + a[i] + "  ");
      }   
    System.out.println("}");
}
  
  public static void printArray2(boolean[] a) { //prints a boolean array
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
   
 public static boolean Ismultiple( int number , int multiple){//checks if number is evenly divisible by multiple
  double number_copy = number;
  if (number_copy/multiple == number/multiple){
    return true;
  }
  return false;
}
 
 public static boolean[] SetTrue( boolean[] bool_list){//sets all boolean values to true
   for (int i =0; i < bool_list.length; i++){
     bool_list[i] = true;
   }
   return bool_list;
 }

 public static int[] add_from_2(int[] int_list){//creates a list from 2 to the maxnum
   int two_plus = 2;
   for (int i=0; i < int_list.length; i++){
     int_list[i] = two_plus;
     two_plus = two_plus+1;
   }
   return int_list;
 }
 

  public static boolean[] findprimes(int maxnum){//computes primes using the sieve of eratosthenes
  int[] primelist = new int[maxnum-1];
  // maxnum is -1 because it counts from 2 to maxnum not 1 to maxnum
  primelist = add_from_2(primelist);
  int checknum = 2;
  boolean[] bool_list = new boolean[primelist.length];
  SetTrue(bool_list);
  for (int i2=0; i2 < primelist.length; i2++){
     for (int i=0; i < primelist.length; i++){
       if (bool_list[i]==true){
         //if it hasn't been determined that the number isn't prime
         if (primelist[i]!=checknum){
           //if the number in the list isn't the one that your checking
           if (Ismultiple(primelist[i],checknum)){
             //if the number your checking is a multiple of the number in the list
             bool_list[i]=false;
             //then it isn't prime
           }
         }
       }
     }       
    
     checknum = checknum+1;
     //check the next number;
     //checknum must be in the second for loop otherwise the program evaluates 2/2 3/3 4/4 instead of 2/2 3/2 4/2 to test primes
     
            
     //the code below is commented out unless i want to see each iteration
     //printArray(primelist);
     //printArray2(bool_list);
     
   }
  //print the list
  printArray(primelist);
  return bool_list;//send the value back to the main method
  }
    
//main loop
  public static void main(String[] args){//the main method calls the function
   printArray2(findprimes(1000));
   long start = System.nanoTime();
   
   long elapsedTime = (System.nanoTime() - start);
   System.out.println("This algorithm took: " + elapsedTime + " nanoseconds");
   System.out.println("Which is: " + elapsedTime + " 1e-9 seconds");
   
  }  
}
