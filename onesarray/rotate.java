import java.util.Scanner;

public class rotate {
    public static int[] rotates(int[] array,int k ){
        int n =array.length;
        int[] newArray =new int[n];
        k =k%n;
        int j =0;
        for(int i =n-k;i<n;i++){
            newArray[j++] =array[i];

        }
        for(int i =0;i<n-k;i++){
            newArray[j++] =array[i];
        }
        return newArray;


    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        arrayinputprint obj =new arrayinputprint();
        int[] array = obj.arrayinput();
        obj.printArray(array);
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nymber nwhich  number you want to rotate ");
        int k =input.nextInt();
        int[] newArray = rotates(array,k);
        System.out.println("now the new array is " );
        obj.printArray(newArray);
        
    }
    
}
