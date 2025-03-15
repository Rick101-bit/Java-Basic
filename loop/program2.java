package loop;

import java.util.Scanner;

public class program2 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the range ");
    int n = input.nextInt();
    for(int i =1;i<=n;i++){
        if(i % 2 == 0){
            System.out.println(i);

        }
    }
    
   }
    
}
