/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Histogram of Letters
 *Purpose: Outputs a histogram of letters contained within a string
 (a list detailing the number of alphabetic characters contained within a string)
*/
public class LetterHistrogram{

  //function to print a list
  public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
  //function to pring ever letter of the alphabet as a list
  public static void printAlphabet(char[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
 
 
  //function to reutrn the number of times a character occurs in a string
  public static int CharIn(String input, char c){
    int counter = 0;
    for (int in = 0; in < input.length()-1; in++){
      if (input.charAt(in) == c){
        counter = counter + 1;
      } 
    }
   return counter;
  }

  //function to create the Histogram from the inputed string
   public static int[] letterHist ( String input ){
     //create the histogram with 26 values (the number of characters in the alphabet)
     int[] histogram = new int[26];
     //convert the input to uppercase
     input = input.toUpperCase();
     int num_char = 0;
     int i = 0;
     //count how many of each letter occurs in the provided string
       for (char a = 'A'; a <= 'Z'; a++){
         num_char = CharIn(input, a);
         histogram[i] = num_char;
         i = i+1;
       }
  return histogram;
  
 }

   
//main loop
public static void main(String[] args){
    char[] alphabet = new char[27];
      int index = 0;
      for (char z = 'A'; z<= 'Z'; z++){
      alphabet[index] = z;
      index = index+1;
    }
    int[] printlist = letterHist("Jerome Clarkson Jane May Richard Hammond");
    printArray(printlist); 
    printAlphabet(alphabet);
 }
}


