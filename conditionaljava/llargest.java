package conditionaljava;
import java.util.Scanner;

public class llargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int a =input.nextInt();
        System.out.println("enter the number");
        int b = input.nextInt();
        System.out.println();
        int c = input.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+"is the graatest number");
            }
           
            else{
                System.out.println(c+"is the largest number");
            }
        }
        else
        {
            if(b>c){
                System.out.println(b+"is the largest ");
            }
            else{
                System.out.println(c+"is the largest number");
            }
        }

    }
    
}
