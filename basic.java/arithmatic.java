import java.util.Scanner;
public class arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number .you want to perform arithjmatic operation");
        int num1 =input.nextInt();
        System.out.println("enter the second inpout  number:");
        int num = input.nextInt();
        int sum = num1+num;
        int multi = num1*num;
        int sub =num1-num;
        int div = num1/num;
        System.out.println("the summation of this two number is "+num1 +"+"+num+ "="+ sum);
        System.out.println("the multiplication of the two number is :"+multi);
        System.out.println("the subtraction of this two number is "+sub);
        System.out.println("the division of thisd two number is "+div);15

    }
    
}
