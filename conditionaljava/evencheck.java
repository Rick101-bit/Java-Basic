package conditionaljava;
import java.util.Scanner;

public class evencheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number that you want to check ");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("the number is even ");
        }
        else
        System.out.println("the number is odd");

    }
    
}
