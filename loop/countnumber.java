package loop;

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count =0;
        if(num == 0)
        count++;
        while ((num !=0)){
            num/=10;
            count++;
        }
        System.out.println("the total numbe rof digit in the number is "+count);
            
            
        }
        


    }

