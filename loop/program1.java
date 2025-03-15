package loop;

import java.util.Scanner;

public class program1 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the range of that number ");
    int n  = input.nextInt();
    for(int i = 0;i<=n;i++){
        System.out.println(i);
    }
    
   }
}
