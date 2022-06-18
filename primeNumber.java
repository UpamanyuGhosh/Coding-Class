import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        boolean prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        double num = sc.nextDouble();
        double x;
        if(num == 0 || num == 1){
        prime = false;
        }
        for(double i = 2 ; i <= Math.sqrt(num) ; i++){
            x = num % i;
            if(x == 0){
               prime = false;
               break;
            }
        }
        if(prime == false){
            System.out.println("No");
        }else{
            System.out.println("Yes");       
         }
    }
}
