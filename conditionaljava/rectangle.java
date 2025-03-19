
package conditionaljava;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {  
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER the height of the rectangle ");
    double height = input.nextDouble();
    System.out.println("enter the width of the rectangle ");
    double width = input.nextDouble();
    double perimeter = 2*(height+width);
    double area =(height*width);
    System.out.println("the perimeter of the rectangle is "+perimeter);
    System.out.println("the area of the rectangle is "+area);
    if(perimeter>area){
        System.out.println("the perimeter is geater than the area ");
    }
    else if(perimeter<area){
        System.out.println("the perimeter is less than the area");
    }
else{
    System.out.println("the perimeter and area is same ");
}
    
}
}