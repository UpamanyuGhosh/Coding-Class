import java.util.*;
public class starPatter3 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number of rows you want");
    int rows = sc. nextInt();
    for (int i = 0 ; i < rows ; i++){     
for (int j = rows - i ; j > 1 ; j--){    
System.out.print(" ");   
}    
for (int j = 0 ; j <= i ; j++ ){    
System.out.print("* ");   
}   
System.out.println();   
}   
}
}
