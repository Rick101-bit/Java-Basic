package Pattern;

import java.util.Scanner;

public class triangles2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the number of series : ");
        int n =input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
