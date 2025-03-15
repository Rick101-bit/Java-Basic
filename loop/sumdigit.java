package loop;

import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum =0;
        int ld;
        while(num !=0){
            ld =num%10;
            sum+=ld;
            num/=10;
            
        }
        System.out.println(sum);


    }
}
