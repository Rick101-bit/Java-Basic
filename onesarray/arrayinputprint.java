import java.util.Scanner;

public class arrayinputprint {
    @SuppressWarnings("resources")
    public int[] arrayinput(){
       
        System.out.print("enter the size of the array:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("enter the each element of the array ");
        for(int i =0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        return array;

    }
    public void printArray(int[] array){
        System.out.println("your array is ");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
            

        }
    }
   
    
}
