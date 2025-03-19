package conditionaljava;
import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number that you want to test");
        int number = input.nextInt();
    
    if(number >99 && number < 1000){
        System.out.println("this is three digit number");

    }
}
    
}
