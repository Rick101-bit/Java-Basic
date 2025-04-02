package string;

import java.util.Scanner;

public class stringreverses {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the string here ");
        String str = input.nextLine();
        String ans ="";
        StringBuilder sb =new StringBuilder("");
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                 sb =new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
    
}
