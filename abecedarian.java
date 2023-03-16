/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: abecedarian
 *Purpose: Test if a given string is abecedarian (a word whose letters appear in alphabetical order)
 */
public class abecedarian {
  
  //Create own length function to return length of string
  public static int length(String s) {
    return s.length();
  }
  
  //Test if a given string (test) is abecedarian
  public static void test_abec(String test){
    //Set boolean sentinel value
    boolean are_we_done_yet = false;
      //Iterate equal to the length of the string
      for (int i = 0; i <= length(test); i++){
        //Iterate from characters A to Z
        for (char a = 'A'; a <= 'Z'; a++){
          //If we have not reached the length of the test string
          if (i+1 < length(test)){
           //If the character from string test in front of character(i) is out of alphabetical order
           if (test.charAt(i) > test.charAt(i+1)){
            //If so the string is not abecedarian
            System.out.println("The string " + test + " is not abecadarian");
            //Exit the program
            are_we_done_yet = true;
            break;
           }
         }
       }
     }
    //Else, if the program has not proven that the string isn't abecadarian, then it is
    if (are_we_done_yet == false){
     System.out.println("The string " + test + " is abecadarian"); 
    }
    
}

  
//Main Loop
  public static void main(String[] args){
    test_abec("bad");  
 }
}