package onesarray;

import java.util.Scanner;

public class predentnum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        maxarray max = new maxarray();
         int[] array =max.arrayinput();
         System.out.println();
         for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
         }
         System.out.println("enter the element , that you want to know the position:");
         int num =input.nextInt();
         for(int i =0;i<array.length;i++){
            if(array[i]==num){
                System.out.println("the position of the element in the array is "+i);
                break;
            }
            
         }
    }
    
}
