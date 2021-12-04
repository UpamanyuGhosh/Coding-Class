import java.util.*;
class testing2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Please Enter A Number");
    int a = sc.nextInt();
int copy = a;

    double i , x = 0.1;
      for(i = 1; i * i  <= a ; i++);
      for(--i ; i * i < a ; i += x);
      System.out.println("Square root of given number "+copy+ " is "+ i);
      sc.close();
}
}