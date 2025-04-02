package string;

import java.util.Scanner;

public class palinsubstring {
    public static boolean ispalindrome(String str){
        boolean flag = true;//palindrome
        int i =0;
        int j =str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String str =input.nextLine();
        int count =0;
        for(int i =0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                if(ispalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count ++;
                }

            }
        }
        System.out.println("the number palindrome substring is "+count);
    }
    
}
