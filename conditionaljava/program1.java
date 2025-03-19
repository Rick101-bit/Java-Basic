package conditionaljava;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ")
        int num = input.nextInt();
        if(num%3==0 || num%5==0){
            if(num%15!=0){
                System.out.println("this phenomena is not satisfied");
            }
            else{
                System.out.println("this is divisible by 15 also ");
            }

        else{
                System.out.println("this is not satisfied also ");
            }
        }



        
    }
    
}
