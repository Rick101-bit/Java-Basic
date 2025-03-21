package Pattern;

import java.util.Scanner;

public class rombos {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SERIES");
        int n =input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
