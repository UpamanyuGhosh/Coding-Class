import java.util.Scanner;
public class leapYear {
   public static void main(String[] args){
      Scanner integer = new Scanner(System.in);
      System.out.println("Enter an Year :: ");
     int year = integer.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){

         System.out.println("This year is a leap year");
      }
      else{
         System.out.println("This year is not a leap year");
         integer.close();
    }
    
   }
}
