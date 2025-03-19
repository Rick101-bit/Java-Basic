package loop;
//wite a program to add all even digit in number

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number that you want to add");
        int number = input.nextInt();
        int sum =0;
        while (number!=0) {
            int ld = number%10;
            if(ld%2 == 0){
                sum+=ld;

            }
            number/=10;


            
        }
        System.out.println("the summation of all even number is "+sum);
    }
    
}
