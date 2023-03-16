/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Fraction
 *Purpose: Create a class to store fraction values capable of adding, subtracting, multiplying, dividing, and simplifying all with methods
 */


//Create fraction class
public class fraction{
  //initialize local variables
  private int numerator;
  private int denominator;
  //if no arguments fraction is 0/1
  public fraction(){
    this.numerator = 0;
    this.denominator = 1;
  } 
  //if arguments provided, the first is the numerator and the second is the denominator
  public fraction(int numerator, int denominator){
      this.numerator = numerator;
      this.denominator = denominator;
  }

  //accessor methods
  public int getNum(){
    return this.numerator;
  }
  public int getDem(){
    return this.denominator;
  }
  public int getFrac(){
    return numerator/denominator;
  }
  
  //convert fraction to string to allow printing
  public String toString(){

    //if the denominator is 0 then the fraction evaluates to ERROR
    if (this.denominator==0){
      return String.format("%s","ERROR DIVIDE BY ZERO");
    }
    //if the numerator is 0 then the fraction evaluates to 0
    else if (this.numerator==0){
      return String.format("%01d",0);
    }
    //Otherwise return the formatted fraction
    return String.format("%01d/%01d",this.numerator,this.denominator);
  }

 //simplify a fraction to the lowest common denominator 
 public fraction simplify(fraction simple){//simple is just what i called the fraction it is not actually a simple value
    //initialize method variables
    fraction answer = new fraction(0,0);
    int divisor = 1;
    int num_simple = simple.getNum();
    int dem_simple = simple.getDem();
    double doubnum = num_simple;
    double doubdem = dem_simple;

    //find the divisor in order to simplify the fraction
    for (int i=1; i<dem_simple+1; i++){
      if (num_simple/i == doubnum/i && dem_simple/i == doubdem/i){
        divisor = i;
     }
    }
    //set answer equal to the new fraction
    answer = new fraction(num_simple/divisor,dem_simple/divisor);
    return answer;
  }
  
  //add two fractions then return the resulting fraction
  public fraction addFrac(fraction frac1, fraction frac2){
    fraction answer = new fraction();
    int num_frac1 = frac1.getNum();
    int dem_frac1 = frac1.getDem();
    int num_frac2 = frac2.getNum();
    int dem_frac2 = frac2.getDem();

    //if denominators are equal add numerators then simplify result
    if (dem_frac1 == dem_frac2){
      answer = new fraction(num_frac1+num_frac2,dem_frac1);
      answer = answer.simplify(answer);
      return answer;
      
    }
    //if denominators aren't equal multiply each fractions numerator by the others denominator
    else if (dem_frac1 != dem_frac2){
      frac1 = new fraction(num_frac1*dem_frac2,dem_frac1*dem_frac2);
      frac2 = new fraction(num_frac2*dem_frac1,dem_frac1*dem_frac2);
      answer = addFrac(frac1,frac2);
    }
   
    //simplify result
    answer = answer.simplify(answer);
    return answer;
  }
  
  //subtract two fractions then return the resulting fraction
  public fraction subFrac(fraction frac1, fraction frac2){
    fraction answer = new fraction();
    int num_frac1 = frac1.getNum();
    int dem_frac1 = frac1.getDem();
    int num_frac2 = frac2.getNum();
    int dem_frac2 = frac2.getDem();

    //if denominators are equal subtract numerators then simplify result
    if (dem_frac1 == dem_frac2){
      answer = new fraction(num_frac1-num_frac2,dem_frac1);
      answer = answer.simplify(answer);
      return answer;
      
    }
    //if denominators aren't equal subtract numerators then simplify result
    else if (dem_frac1 != dem_frac2){
      frac1 = new fraction(num_frac1*dem_frac2,dem_frac1*dem_frac2);
      frac2 = new fraction(num_frac2*dem_frac1,dem_frac1*dem_frac2);
      answer = subFrac(frac1,frac2);
    }
    
    answer = answer.simplify(answer);
    return answer;
  }
  
  //multiply two fractions then return the resulting fraction
  public fraction mulFrac(fraction frac1, fraction frac2){
    fraction answer = new fraction();
    int num_frac1 = frac1.getNum();
    int dem_frac1 = frac1.getDem();
    int num_frac2 = frac2.getNum();
    int dem_frac2 = frac2.getDem();

    answer = new fraction(num_frac1*num_frac2,dem_frac1*dem_frac2);
    answer = answer.simplify(answer);
    return answer;
  }
  
  //divide two fractions then return the resulting fraction
  public fraction divFrac(fraction frac1 , fraction frac2){
    fraction answer = new fraction();
    int num_frac1 = frac1.getNum();
    int dem_frac1 = frac1.getDem();
    int num_frac2 = frac2.getNum();
    int dem_frac2 = frac2.getDem();
    //multiply by the reciprocal
    answer = new fraction(num_frac1*dem_frac2,dem_frac1*num_frac2);
    answer = answer.simplify(answer);
    return answer;
  }
  
  
  
  //main loop
  public static void main(String[] args){
    fraction a = new fraction(5,12);
    fraction b = new fraction(13,39);
    System.out.println("add:"+a.addFrac(a,b));
    System.out.println("sub:"+a.subFrac(a,b));
    System.out.println("mul:"+a.mulFrac(a,b));
    System.out.println("div:"+a.divFrac(a,b));
    
  }
}
  
    