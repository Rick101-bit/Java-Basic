package Pattern;

import java.util.Scanner;

public class binarytriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num =input.nextInt();
        for(int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print(1+" ");

                    }
                    else{
                        System.out.print(0+" ");
                    }
                }

            }
            System.out.println();
        }
    }
    
}
