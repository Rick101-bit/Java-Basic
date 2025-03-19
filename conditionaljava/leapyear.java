package conditionaljava;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the year");
        int year = input.nextInt();
        if(year%4==0 &&year%100!=0){
            System.out.println("the year is leapyear");

        }
        else if(year%100==0 && year%400==0){
            System.out.println("this is also leapyear");

        }
        else
        System.out.println("this is not leap year");
    }
}
