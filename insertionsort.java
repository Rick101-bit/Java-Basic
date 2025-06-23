import java.util.Scanner;

public class insertionsort {
    static void insertionSort(int[] array){
        int n =array.length;
        for(int i =1;i<n;i++){
            int j = i;
            while(j>0 && array[j]<array[j-1]){
                int temp =array[j];
                array[j] =array[j-1];
                array[j-1] =temp;
                j--;
            }
        }
        System.out.print("the array after sorting is ");
        for(int val :array){
            System.out.print(val + " ");
        }
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the size 0f the array ");
        int len =input.nextInt();
        int[] array = new int[len];
        System.out.println("enter the array element");
        for(int i =0;i<len;i++){
            int ele= input.nextInt();
            array[i] =ele;

        }
        
        System.out.println();
        System.out.println("the array is ");
        for(int i =0;i<len;i++){
            System.out.print(array[i]+" ");

        }
        insertionSort(array);
        
    
    }

    
}