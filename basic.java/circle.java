import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle ");
        double radius = input.nextDouble();
        double pi  =3.1415;
        Double area = 2*pi*radius*radius;
        System.out.println("the area of the circle is "+area);
        double circumference = 2*pi*radius;
        System.out.println("the circumference of the circle is "+circumference);6
        
    }
    
}
