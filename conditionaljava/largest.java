package conditionaljava;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number ");
        int num1 = input.nextInt();
        System.out.println("enter the second number :");
        int num2 = input.nextInt();
        System.out.println("enter the third number :");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+"is largest number");

        }
        else if (num2>num1 && num2>num3) {
            System.out.println(num2+"is largest number");
            
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+"is largest number");
        }
        else{
            System.out.println("they are equal number");
        }
    }
    
}
