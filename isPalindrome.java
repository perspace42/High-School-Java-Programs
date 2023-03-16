/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Palindrome Test
 *Purpose: Test if a given string is a palindrome
 */

public class is_palindrome{
  
  /**
 * Returns the first character of the given String.
 */

public static char first(String s) {
    return s.charAt(0);
} 

/**
 * Returns all but the first letter of the given String.
 */
public static String rest(String s) {
    return s.substring(1);
} 

/**
 * Returns all but the first and last letter of the String.
 */
public static String middle(String s) {
    return s.substring(1, s.length() - 1);
} 

/**
 * Returns the length of the given String.
 */
public static int length(String s) {
    return s.length();
} 


//Returns the last character contained within a string
public static char last (String s) {
  
  if (length(s) > 0){
  return s.charAt(length(s)-1);
  }
  //otherwise return '@' as a stop value
  return '@';
}

//Returns an inputed string without its last character
public static String removelast(String s){
  String empty = "";
 
  for (int i = 0; i<length(s)-1; i++){
    if (length(s)>0){
    empty = empty + s.charAt(i);
  }
 
  System.out.println(empty);
  }
  return empty;
}

//Tests if an inputed string is a palindrome
public static void palindrome(String s){
  //first convert string to lowercase
  s = s.toLowerCase();
  //initialize variables
  String copy = s;
  String reverse_s = "";
  //reverse the string
  for (int i = 0; i <= length(s); i++){
    if (last(copy)!='@'){
    reverse_s = reverse_s + last(copy);
    copy = removelast(copy);  
    //print out each step of reversing the string (each character) added in sequence
    System.out.println("placeholder build: " + reverse_s);
   }
  }
  //print the string completely reversed
  System.out.println("placeholder rev_s: " + reverse_s);

  //if the reversed string is exactly equal to the original string then it is a Palindrome
  if (reverse_s.equals(s)) {
    //variable.equals(string) must be used because string is not a basic data type;
    System.out.println(s + " is a palindrome");
  //otherwise the original string is a palindrome
  }else{
    System.out.println("placeholder s: " + s);
    System.out.println(s + " is not a palindrome");
    System.out.println("r_s:" + length(reverse_s));
    System.out.println("s:" + length(s));
  }
}

//main loop
public static void main(String[] args){
  palindrome("racecar"); 
 }  
}

  
  
  