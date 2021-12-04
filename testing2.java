class testing2{
public static void main(int a) {
System.out.println("Please Enter A Number"+a);
int copy = a;

    double i , precision = 0.1;
      for(i = 1; i * i  <= a ; i++);
      for(--i ; i * i < a ; i += precision);
      System.out.println("Square root of given number  "+copy+ " is "+ i);
}
}