package method;
import java.util.Scanner;


public class permutation {
    public static int fact(int n){
        int factorial =1;
        for(int i =n;i>=1;i--){
            factorial*=i;

        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the total n number ");
        int n =input.nextInt();
        System.out.println("enter the number that to be choosen ");
        int r =input.nextInt();
       int  npr =fact(n)/fact(n-r);
       System.out.println(npr);
       int ncr =fact(n)/(fact(r)*fact(n-r));
       System.out.println(ncr);

    }
    
}
