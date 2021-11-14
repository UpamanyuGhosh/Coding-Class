import java.util.*;

public class Break {
   public static void main(String args[]){
      
    int number,a = 0;
    Scanner pr = new Scanner(System.in);
      System.out.println("Enter a number :-");
      number = pr.nextInt();
    for(int i = 2 ; i <= number; i++){
        if(number % i == 0){
            break;
        }else{
            i++;
            a = i;
        }
    }
    if( a == number){
        System.out.println("The number is a prime number");
    }else{
        System.out.println("The number is not a prime number");
    }
   
    
      pr.close();
   }
}