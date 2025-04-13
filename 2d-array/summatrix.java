//write a program , take input of ARRAY ANd take input of the array , and take input of the coordinae and do summjation of the rectangle formed by the coordinateusing Bruteforce method.
import java.util.Scanner;

public class summatrix {
    public static int sumArray(int[][] array,int r1,int c1,int r2,int c2){
        int sum =0;
        for(int i =r1;i<=r2;i++){
            for(int j = c1;j<=c2;j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        arrayInput obj  = new arrayInput();
        int[][] array = obj.inputarray();
        obj.printArray(array);
        Scanner input =new Scanner(System.in);
        System.out.println("eneter the the row of the first coordinate");
        int r1  =input.nextInt();
        System.out.println("eneter the the col of the first coordinate");
        int c1 =input.nextInt();
        System.out.println("eneter the the row of the second coordinate");
        int r2 =input.nextInt();
        System.out.println("eneter the the col of the second coordinate");
        int c2 =input.nextInt();
        int sum =sumArray(array,r1,c1,r2,c2);
        System.out.println("the summaion of the element of the array is "+sum);


    }
    
}
