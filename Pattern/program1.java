package Pattern;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter thed number of row");
        int row = input.nextInt();
        System.out.println("enter the number of column");
        int col =input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
