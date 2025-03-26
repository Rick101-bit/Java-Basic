package string;

import java.util.Scanner;

public class allsubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string");
        String str = input.nextLine();
        int len =str.length();
        for(int i =0;i<len;i++){
            for(int j =i+1;j<len+1;j++){
                System.out.print(str.substring(i, j)+" ");
            }
        }
    }
    
}
