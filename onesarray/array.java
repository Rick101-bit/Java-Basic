// package onesarray;

import java.util.Scanner;

class rick{
    public int[] arr(){
        @SuppressWarnings("resources")
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = input.nextInt();
        int[] arr =new int[size];
        System.out.println("now this is the time for value entering in the array");
        for(int i =0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        return arr;
        
    }
    
}

public class array {                      
    public static void main(String[] args) {
        rick obj =new rick();
        int[] array = obj.arr();
        for(int ele :array){
            System.out.print(ele);
        }
      
    }
   
}
