import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the dividend");
        int d = input.nextInt();
        System.out.println("eenter the divisor");
        int d1 =input.nextInt();
        int q =d/d1;
        int remainder = d -d1*q;
        System.out.println("the remainder of the dividend "+d+",when the divisor"+d1+":"+remainder);


    }
    
}
