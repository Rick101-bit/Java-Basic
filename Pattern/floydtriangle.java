package Pattern;

import java.util.Scanner;

public class floydtriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int p =1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
    
}
