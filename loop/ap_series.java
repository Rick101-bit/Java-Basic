package loop;

import java.util.Scanner;
//print this ap series 4,7,10,13....

public class ap_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the range ");
        int num =input.nextInt();
        //first number a = 4, differnce d = 3,so nth term will be  a+(n-1)*d , == 4+(n-1)*3 == 3n +1
       //
        int a =4,d =3;
        for (int i =1;i<=num;i++){
            System.out.print(a+" ");
            a+=d;

        }

        

        
    }
    
}
