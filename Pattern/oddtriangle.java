package Pattern;

import java.util.Scanner;

public class oddtriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the row number");
        int row =input.nextInt();
        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
    
}
