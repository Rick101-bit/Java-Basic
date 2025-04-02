package onesarray;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter thenumber of or size of your array:");
        int size =input.nextInt();
        int[] arr =new int[size];
        System.out.println("enter the value of array ");

        for(int i =0;i<size;i++){
            int value=input.nextInt();
            arr[i]=value;

        }
        System.out.println("here is your array:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("the total summatiion of elements of the array is "+sum);
    }
    
}
