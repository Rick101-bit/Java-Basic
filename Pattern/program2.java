package Pattern;
//write a program to print this pattern 1234 upto n row and column
//                                      1234
//                                      1234
//                                      1234

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the series of the pattern");
        int series =input.nextInt();
        for(int i=1;i<=series;i++){
            for(int j=1;j<=series;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
   
    
}
