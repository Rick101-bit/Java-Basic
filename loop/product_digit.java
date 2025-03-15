package loop;

import java.util.Scanner;

public class product_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int product =1;
        while (num !=0) {
            int ld = num%10;
            if(ld !=0){
                product*=ld;
            }
            num/=10;
            
        }
        System.out.println(product);
    }
}
