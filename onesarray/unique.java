import java.util.Scanner;

public class unique {
    public static int[] uniquee(int[] array){
        for(int i =0;i<array.length;i++){
           for(int j =i+1;j<array.length;j++){
            if (array[i]==array[j]) {
                array[i]=-1;
                array[j]=-1;

                
            }
           }
        }
        return array;

    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        tripletsum obj =new tripletsum();
        Scanner input =new Scanner(System.in);
        int[] array = obj.arrayCreation(input);
        obj.printArray(array);
        int[] arraynew =uniquee(array);
        System.out.println("the uniquew nelement of the array are :");
        for(int i =0;i<arraynew.length;i++){
            if(arraynew[i]!= -1){
                System.out.print(array[i]+" ");
            }

        }
    }
    
}
