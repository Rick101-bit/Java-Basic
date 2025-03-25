package method;

import java.util.Scanner;

public class pascaltriangle {
    public static int fact(int num){
        int xfact =1;
        for(int i =1;i<=num;i++){
            xfact*=i;
        }
        return xfact;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of row:");
        int row = input.nextInt();
        for(int i =0;i<=row;i++){
            for(int j =1;j<=row-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =0;j<=i;j++){
                int icj =fact(i)/(fact(j)*fact(i-j));
                System.out.print(icj+" "+" ");
            }
            System.out.println();
        }
    }
    
}
