package conditionaljava;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number percentage of the student");
        double marks = input.nextDouble();
        if(marks<=100 && marks>90 ){
            System.out.println("excellent");
        }
        else if(marks<=90 && marks>80){
            System.out.println("good");
        }
        else if(marks>=80 && marks<70){
            System.out.println("average");

        }
        else if (marks>=70&& marks<60) {
        System.out.println("ok");
            
        }
        else{
            System.out.println("you are not eligible yar");
        }


    }
    
    
}
