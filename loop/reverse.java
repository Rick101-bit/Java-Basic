package loop;

import java.util.Scanner;

//write a code to print reverse of a numbern without using arrray , using for loop 
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num =input.nextInt();
        int r =0;
        for(;num!=0; num /=10){
            int ld =num%10;
            r*=10;
            r+=ld;



        }
        System.out.println("the reverse number is "+r);
    }
    
}
