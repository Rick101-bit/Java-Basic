package Pattern;

import java.util.Scanner;

public class triangles {
    public static void main(String[] args) {
        Scanner  input =new Scanner(System.in);
        System.out.println("enter the row:");
        int row = input.nextInt();
        System.out.println("enter the colunm");
        int col = input.nextInt();
        for(int i =1;i<=row;i++){
            for(int j =1;j<=col;j++){
                if(i+j >row+1){
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
