package Pattern;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of row");
        int num =input.nextInt();
        int mid =num/2+1;
        for(int i =1;i<=num;i++){
            for(int j=1;j<=num;j++){
              if(i==mid||j==mid){
                System.out.print("*"+" ");
              }
              else{
                System.out.print(" "+" ");
              }
              
            }
            System.out.println();
            
        }
    }
}
