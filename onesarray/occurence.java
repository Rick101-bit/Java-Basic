import java.util.Scanner;

public class occurence {
    private Scanner input;
    public occurence(){
        input = new Scanner(System.in);

    }
    public  int[] createArray(){
        System.out.println("enter the size of the array ");
        int size = input.nextInt();
        int[] array =new int[size];
        System.out.println("it is time insertion of value of the array:");
        for(int i =0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        return array;

        
    }
    public int occurenceEle(int num,int[] array){
        int count =0;
        for(int i =0;i<array.length;i++){
            if(array[i]==num){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        occurence obj =new occurence();
        int[] array=obj.createArray();
        System.out.println("enter the element that you want to know the occurence");
        int number =obj.input.nextInt();
        int count =obj.occurenceEle(number,array);
        System.out.println("the occurence of the element in this array is "+count);
    }
    
}
