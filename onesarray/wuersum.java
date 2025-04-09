//suppose there is an array  "a ", take input the number of query you want to know the number of query running 
//without any iteration using prefixsum , solve it 

import java.util.Scanner;

public class wuersum {
    public static int[] prefixSum(int[] array){
        int n =array.length;
        int[] prefixArray =new int[n+1];
        
       
        for(int i =1;i<=n;i++){
            prefixArray[i] =prefixArray[i-1]+array[i];

        }
        return prefixArray;
    }
    public static int sumArray(int[] array,Scanner input,int[] prefixArray){
        int sum =0;
        System.out.println("enter the number of query");
        int q =input.nextInt();
        System.out.println("enter the starting point ");
        int l =input.nextInt();
        System.out.println("enter the ending point ");
        int r =input.nextInt();
        while(q-- >0){
            sum =prefixArray[r] -prefixArray[l-1];

        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);     
        arrayinputprint obj = new arrayinputprint();
       System.out.println("enter the size of  the array ");
       int size = input.nextInt();
       int[] array =new int[size+1];
       System.out.println("enter the element of the array , that is 1 indexing ");
       for(int i =1;i<=size;i++){
        array[i] =input.nextInt();
       }
        obj.printArray(array);
        int[] prefixArray = prefixSum(array);
        int sum =sumArray(array,input,prefixArray);
        System.out.println("the summation is "+sum);
    }
    
}
