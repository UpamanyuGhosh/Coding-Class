import java.util.*;

public class parkingSlotOccupation1 {
    public static void main(String[] args) {
        int loop = 0;
        while (loop != 0){
        Scanner sc = new Scanner(System.in);
        int slot = 5,positiveSlot = 0;
        System.out.println("Please Enter 1 if you want to park, 2 if you want to leave, 3 if you want to check the parking menu & 4 if you want to exit the parking slot");
    int choice = sc.nextInt();
    switch (choice){
        case 1:
        if (positiveSlot <= 5){
        System.out.println("Please leave your vehicle and the vallet will park your car. Thank You");
    positiveSlot++;    
    }
        break;
        case 2:
        System.out.println("Thank You For Choosing Our Parking Centre. Please Visit Us Again.");
            positiveSlot--;
       break;
    
        case 3:

        System.out.println("PARKING MENU");
        System.out.println("VACANT SLOTS -- "+(5-positiveSlot));
        System.out.println("OCCUPIED SLOTS   -- "+positiveSlot);
        break;
        case 4:
        System.out.println("Thank You for choosing this parking slot");
        System.exit(0);
        default:
        System.out.println("Please Enter A Operatable Number(1 OR 2 OR,3)");
       break;
    }  }  
    
    }}