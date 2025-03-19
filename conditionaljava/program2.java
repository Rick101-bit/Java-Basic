package conditionaljava;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int number = input.nextInt();
        if(number%5==0){
        
         System.out.println("the number is divisible by 5 ");
        }
        else
            System.out.println("the number is not divisible by 5");
        
    }
    
}
