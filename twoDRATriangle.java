import java.util.*;
public class twoDRATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Please enter the number of columns");
        int column = sc.nextInt();
        int [][] array = new int[row][column];

        if(row == column){
        System.out.println("Please enter the elements");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                array[i][j] = sc.nextInt();
            }
        }}
        else{
            System.out.println("The number of rows and columns are not equal. Please correct it");
            System.exit(0); 
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(array[i][j]+" ");
                
            } 
            System.out.println("");
        }
        
    }
}

