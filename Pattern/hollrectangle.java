package Pattern;

import java.util.Scanner;

public class hollrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row number:");
        int row = input.nextInt();
        System.out.println("enter the column number:");
        int col =input.nextInt();
        for(int i =1;i<=row;i++){
            for(int j =1;j<=col;j++){
                if (i==1 ||i == row || j ==1 ||j==col) {
                    System.out.print("* ");                    
                } 
                else{
                    System.out.print("  ");
                }              
            }
            System.out.println();
        }
    }
}
