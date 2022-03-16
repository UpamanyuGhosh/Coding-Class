import java.util.*;
public class secondHighestArray {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements You Want In The Array");
        int limit = sc.nextInt();
        int[] arr1 = new int[limit];
        System.out.println("Please Enter The Numbers");
        for(int i = 1 ; i <= limit ; i++){
            arr1[i] = sc.nextInt();
        }
        int largest = arr1[1];
        int secondLargest = arr1[1];
    for(int x = 1 ; x <= arr1.length ; x++){
        if(arr1[x] > largest){
            secondLargest = largest;
        largest = arr1[x] ;
           }else if (arr1[x] > secondLargest) {
               secondLargest = arr1[x];
           }
        }
    System.out.println(secondLargest+" is the second largest number in the array of number entered by you");
    sc.close();
    }

    }

