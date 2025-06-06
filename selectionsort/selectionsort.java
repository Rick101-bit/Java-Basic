import java.util.Scanner;

public class selectionsort{
    static void selectionSort(int[] array){
        int n =array.length;
        for(int i =0;i<n-1;i++){
            int min_index = i;
            for(int j =i+1;j<n;j++){
                if(array[j]<array[min_index]){
                    min_index =j;
                }
            }
            int temp =array[i];
            array[i] =array[min_index];
            array[min_index] =temp;
        }
        System.out.println("the sorted array is ");
        for(int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the ength of the array ");
        int len =input.nextInt();
        int [] array = new int[len];
        System.out.println("now this is the time to enter the value of the array ");
        for(int i =0;i<len;i++){
             array[i] =input.nextInt();
        }
        System.out.print("your input array is ");
        for(int i =0;i<len;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        selectionSort(array);
        
    }
}