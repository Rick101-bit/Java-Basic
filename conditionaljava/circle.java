package conditionaljava;
//a coordinate and radius of a circle is given , check that 

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double rad =input.nextDouble();
        int x =2,y=3;
        System.out.println("enter the x cordinate of the point ");
        int x1 =input.nextInt();
        System.out.println("enter the cordinate of the y :");
        int y1 =input.nextInt();
        
        double distance=((x-x1)*(x-x1))+((y-y1)*(y-y1));
        if((distance*distance) ==rad*rad){
            System.out.println("the point is on the circumference ");

        }
        else if((distance*distance)>rad*rad){
            System.out.println("the point is outside of the circle   ");
        }
        else{
            System.out.println("the point is inside the circle ");
        }

    }
    
}
