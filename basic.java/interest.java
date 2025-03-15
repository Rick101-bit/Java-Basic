import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your principle aamount ");
        double p = input.nextDouble();
        System.out.println("enter the time duration ");
        double t =input.nextDouble();
        int r =7;
        double a =(p*r*t)/100;
        System.out.println("the interest you will get is "+a);
        double actual = p+a;
        System.out.println("you will get total "+actual+"rupees");

        
    }
    
}
