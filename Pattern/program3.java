package Pattern;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number ");
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
