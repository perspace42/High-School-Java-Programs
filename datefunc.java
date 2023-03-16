/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: DateEuro&American
 *Purpose: print the date in both European and American format with using separate methods
 */
public class datefunc{

  public static void printamerican(String day, String date, String month , String year){
    System.out.println(day + ", " + month + " " + date + " " + year);
  }

  public static void printeuropean(String day, String date, String month , String year){
    System.out.println(day + " " + date + " " + month + " " + year);
  }

  public static void main(String[] args){
    printamerican("Thursday","12","January","2017");
    printeuropean("Thursday","12","January","2017");

  }
}
