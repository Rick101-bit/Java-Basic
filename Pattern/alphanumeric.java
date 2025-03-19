package Pattern;

import java.util.Scanner;

public class alphanumeric {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number");
        int n =input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
