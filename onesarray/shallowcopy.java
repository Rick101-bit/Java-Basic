import java.util.Scanner;

public class shallowcopy {
    static int[] arrayinput(){
        @SuppressWarnings("resources")
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i =0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        return array;


    }
    static void changearray(int[] array){
        for(int i =0;i<array.length;i++){
            array[i]=0;
        }
    }
    static void printarray(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array =arrayinput();
        int[] array_2 =array.clone();
        printarray(array_2);
        System.out.println();
        printarray(array);

        changearray(array_2);
        System.out.println();
        System.out.println("after changing the array is ");
        printarray(array_2);

        
        
    }
}
