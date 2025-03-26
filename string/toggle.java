package string;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str =new StringBuilder(input.nextLine());
        for(int i =0;i<str.length();i++){
            boolean flag =true;// for capital
            char ch =str.charAt(i);
            int asci =(int)ch;
            if(asci>=97){
                flag =false;//for small
            }
            if(flag ==true){
                asci+=32;
                char cha =(char)asci;
                str.setCharAt(i, cha);
            }
            else{
                asci-=32;
                char cha =(char)asci;
                str.setCharAt(i, cha);
            }
        }
        System.out.println(str);
    }
    
}
