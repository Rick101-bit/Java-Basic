import java.util.Scanner;

public class sorted {
    public int[] arrayInput(Scanner input){
        System.out.println("enter the array size");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("enter the element odf thd array ");
        for(int i =0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        return array;
    }
        public void sort(int[] array){
            boolean tag = true;//sorted 
            for(int i =1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    tag =false;
                    break;
                    
                }
            }
            if(tag== true){
                System.out.println("the array is sortd ");
            }
            else{
                System.out.println("the array is not sorted");
            }

        


    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner input =new Scanner(System.in);
        sorted obj =new sorted();
        int[] array = obj.arrayInput(input);
        obj.sort(array);
    }
    
}
