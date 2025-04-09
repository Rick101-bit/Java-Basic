import java.util.Scanner;

public class searching {
    //create a program to searching element using frequeny array 
    public static int[] makeFrequencyArray(int[] array){
        int[] frequencyArray =new int[1000004];
        for(int i =0;i<array.length;i++){
            frequencyArray[array[i]]++;
        }
        return frequencyArray;
    }
    public static void  elementcheck(int[] array,int[] frequencyArray,Scanner input){
        System.out.println("enter the number you wanrt to run queries");
        int n =input.nextInt();
        while(n>0){
            System.out.println("enter the element want to check");
            int num =input.nextInt();
            if(frequencyArray[num]>0){
                System.out.println("the number is present ");
            }else{
                System.out.println("then the number ia vanished");
            }

        }
        n--;

    }
    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        Scanner input =new Scanner(System.in);
        int [] array = obj.arrayinput();
        obj.printArray(array);
        int[] frequencyArray =makeFrequencyArray(array);
       
        elementcheck(array,frequencyArray,input);

    }
    
}
