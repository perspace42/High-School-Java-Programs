/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Anagram
 *Purpose: Test if one string is the anagram of another string (if the letters from one string can be rearranged to be another string)
 */

public class anagram{

  //function to remove spaces from an inputed string.
  public static String rem_sp(String input){
    String output = "";
    for (int i=0; i<input.length(); i++){
      if (input.charAt(i)!= ' '){
        output = output + input.charAt(i);
      }
    }
  return output;
  }
  //function to return the number of times a character is within a string.
  public static int times_in(String s, char c){
     int times = 0;
    for (int i = 0; i<s.length(); i++){
      if (s.charAt(i)==c){
        times = times+1;
      }
    }
    return times;
  }

  //function to test if one string is the anagram of another string.   
  public static boolean Anagram(String input , String ana){
      //first remove spaces from both strings
      input = rem_sp(input);
      ana   = rem_sp(ana  );
      //if the lengths are different the strings cannot be anagrams of one another
      if (input.length() != ana.length()){
        return false;
      }
      //then test the number of times each character occurs in each string
      for (int i=0; i<input.length(); i++){
        //if the number of times a character occurs in each string is different, then the string is not an anagram
        if (times_in(input,input.charAt(i)) != times_in(ana,input.charAt(i))){
          //exit the function
          return false;
        } 
  }
  //If each string has exactly the same number of identical characters then the string is an anagram
  return true;
}

//main loop
public static void main(String[] args){
  System.out.println(Anagram("mother in law","woman hitler"));
       
 }
}
    
   