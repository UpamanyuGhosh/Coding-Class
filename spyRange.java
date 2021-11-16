import java.util.*;
class spyRange{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter The Starting Number Of The Range :-");
int range1 = sc.nextInt();
System.out.println("Enter The Starting Number Of The Range :-");
int range2 = sc.nextInt();
for(int i = range1 ; i <= range2 ; i++){
     int num = i;
     int sum = 0,product = 1,a;
while(num != 0){
    a = num % 10 ;
    sum += a;
    product *= a;
    num /= 10;
}
if(sum == product){
    System.out.println(i);
}
    }

sc.close();
}}