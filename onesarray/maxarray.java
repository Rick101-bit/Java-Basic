package onesarray;

import java.util.Scanner;
public class maxarray {
    public int[] arrayinput(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = input.nextInt();
        int[]arr =new int[n];
        System.out.println("enter the element of the array:");
        for(int i =0;i<arr.length;i++){
            int value =input.nextInt();
            arr[i]=value;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;

    }
    public static void main(String[] args) {
        maxarray obj =new maxarray();
       int[] array =  obj.arrayinput();
       int max =0;
       for(int i =0;i<array.length;i++){
           if(array[i]>max){
            max =array[i];
           }
        }
        System.out.println("now the maximum element from the array is "+max);
       

    
        
    }
    
}
