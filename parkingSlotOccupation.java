
import java.util.Scanner;

public class parkingSlotOccupation {
    public static void main(String[] args) {
        int a = 0;
        while(a < 5) {
            Scanner sc = new Scanner(System.in);
            int slots[] = {0, 0, 0, 0, 0};
            System.out.println("Please enter the number of parking slot you want to occupy");
            int parkingSlot = sc.nextInt();
            int i = 0;
            while (i < 5) {
                if (slots[i] == 0) {
                    switch (parkingSlot) {
                        case 1:
                            slots[0] = 2;
                            break;
                        case 2:
                        slots[1] = 4;
                            break;
                        case 3:
                        slots[2] = 6;
                            break;
                        case 4:
                        slots[3] = 8;
                            break;
                        case 5:
                        slots[4] = 10;
                    }
                    System.out.println("This slot is empty so you can park here");
                    break;
                } else if (slots[i] != 0) {
                    System.out.println("Sorry but this seat has already been taken");
                    System.exit(0);
                }
                i++;
                sc.close();
            }
            a++;
        }

        }
    }