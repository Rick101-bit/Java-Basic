package loop;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the range");
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
