package string;

import java.util.Scanner;

public class compressstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string that you want to insert :");
        String str = input.nextLine();
        String ans =""+str.charAt(0);
        int count =1;
        for(int i =1;i<str.length();i++){
            char curr =str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }
            else{
                ans +=count+" ";
                count =1;
                ans+=curr;
            }
        }
        System.out.println(ans);

    }
    
}
