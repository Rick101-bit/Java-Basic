package conditionaljava;
//check that a point is in the x axis or y axis or in the origin 
import java.util.Scanner;

public class origin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if(x==0 && y==0){
            System.out.println("this is in the origin");
        }
        else if(x==0){
            System.out.println("this point is in y axis");

        }
        else if(y==0){
            System.out.println("this point is in x axis");
        }
        else{
            System.out.println("this is located in another region");
        }
    }
    
}
