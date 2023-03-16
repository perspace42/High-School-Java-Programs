/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: scrabble
 *Purpose: Test if a provided amount of scrabble tiles in hand can spell a word
 */
public class scrabble{
  
  //return the number of times char c occurs in string s
  public static int times_in(String s, char c){
     int times = 0;
    for (int i = 0; i<s.length(); i++){
      if (s.charAt(i)==c){
        times = 1;
      }
    }
    return times;
  }
  //test if the characters within string hand are capable of creating string word 
  public static boolean scrab_test(String hand , String word){
       int limit = word.length();
       int checker = 0;
       for (int i=0; i<word.length(); i++){
           checker = checker + times_in(hand,word.charAt(i));
         }
       if (limit == checker){
         return true;
       }
    
  return false; 
}

    //main loop
    public static void main(String[] args){
      System.out.println(scrab_test("spep olleh","hello peps"));
      //tiles in hand, word to spell;
  } 
}
  
 