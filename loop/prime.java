package loop;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number , that you want to check prime or not ::");
        int n = input.nextInt();
        boolean flag = false;
        for(int i =2;i<n;i++){
            if(n%i==0){
                flag =true;
                
            }
            break;   

        }
        if(n==1){
            System.out.println("neither prime or composite number");
        }
        else if(flag == false){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is a composite number");
        }

    }
}
