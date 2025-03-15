package loop;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int n =input.nextInt();
        int hf =1;
        for(int i =1;i<n;i++){
            if(n%i == 0){
                hf =i;
            }


        }
        System.out.println(hf);
    }
}
