import java.util.Scanner;

class evenFibonacci{  
public static void main(String args[])  
{    
    int fibonacci = 0, no1 = 1, no2 = 0, sum = 0,  i = 0;
    while(fibonacci < 1000){
        fibonacci = no1 + no2;
        if(fibonacci % 2 == 0){
            
            sum += fibonacci;
            i++;
            System.out.println(""+fibonacci);
        }
        no2 = no1;
        no1 = fibonacci;
    }
    System.out.println("Sum Of Even Number ------ "+sum);
    System.out.println("Number Of Even Values ------- "+i);
  
}}