package string;

import java.util.Scanner;

public class compareto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first string ");
        String str =input.nextLine();
        System.out.println("enter the next string ");
        String gtr =input.nextLine();
        System.out.println(str);
        System.out.println(gtr);
        int x =str.compareTo(gtr);
        System.out.println(x);
    }
}
