package loop;

import java.util.Scanner;

public class gp_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the range :");
        int num = input.nextInt();
        // print this gp series 1,2,4,6,8,10, 12, 14, 16...upto n term 
        //nth term == N = a*r to the powwer n-1
        int a = 1, r =2;
        for(int i = 1;i<=num;i++){
            System.out.println(a+" ");
            a =a*r;
        }
    }
    
}
