package Pattern;

import java.util.Scanner;

public class crossstar {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row =input.nextInt();
        int col =input.nextInt();
       for(int i =1;i<=row;i++){
        for(int j =1;j<=col;j++){
            if(i ==j || (i+j==row +1)){
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
