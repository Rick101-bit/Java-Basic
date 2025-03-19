package Pattern;
//print thias *
//            * *
//            * * *
//            * * * *
// up to n rows

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n =input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
