package conditionaljava;
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number that you eant to find iut absolute value");
        int number = input.nextInt();
        if(number<0){
            System.out.println( "the absolute number if this number is "+number*(-1));
        }
        else{
            System.out.println("the absolute value of the number is "+number);
        }
    }
    
}
