package conditionaljava;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int dividend = input.nextInt();
        if(dividend%3 ==0 && dividend %5 ==0){
            System.out.println("the number is both divisible by 3 qand 5 ");
        }
        else{
            System.out.println("this is not divisible by 3 and 5 both");15
        }
        
    }

}
