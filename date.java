/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: Date
 *Purpose: Create a class to store the date
 */

public class date{
  private int day;
  private int month;
  private int year;
 
  public date(){
  this.day = 1;
  this.month = 1;
  this.year = 2017;
  }
  
  public date(int day, int month, int year){
     this.day = day;
     this.month = month;
     this.year = year;
    
  }
  public int getDay(){
    return this.day;
  }
  public int getMonth(){
    return this.month;
  }
  public int getYear(){
    return this.year;
  }
  
  public int getDate(){
    return this.year+this.month/12+this.day/364; 
  }
  
  public String toString(){
    return String.format("%02d/%02d/%04d",this.day,this.month,this.year);
  }
  
  public static void main ( String[] args ){
    date Date = new date(2,28,2017);
    System.out.println(Date);
  }
 } 
