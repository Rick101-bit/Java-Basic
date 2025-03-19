package Pattern;

import java.util.Scanner;

public class patternulta {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("wenter ther number ");
        int n = input.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
