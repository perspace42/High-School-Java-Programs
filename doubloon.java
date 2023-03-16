/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Doubloon Checker  
 *Purpose: Create a function to check if a string is a doubloon 
 (If each of a strings characters occur twice within the string, the string is a doubloon)  
 */

public class doubloon {
  //function to check how many times a character occurs within a string
  public static int times_in(String s, char c){
     int times = 0;
    for (int i = 0; i<s.length(); i++){
      if (s.charAt(i)==c){
        times = times+1;
      }
    }
    return times;
  }
  
  //check if a string is doubloon
  public static boolean checkD(String input){
    //convert input to uppercase 
    input = input.toUpperCase();
    int times = 0;
    for (char a = 'A'; a<='Z'; a++){
      times = times_in(input,a);
      //if the checked character occurs, and doesn't occur twice, then the string is a doubloon.
      if (times!=2 && times!=0){
        return false;
      }
    }
    return true;
  }
   
  //main loop
  public static void main(String[] args){
   System.out.println(checkD("anna"));
  }
  
  
}