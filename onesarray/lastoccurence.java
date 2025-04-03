import java.util.Scanner;

public class lastoccurence {
    public int[] arrayCreation(Scanner input){
        System.out.println("enter the size of the array ");
        int size =input.nextInt();
        int[] array = new int[size];
        System.out.println("enter the element sof each array ");
        for(int i =0;i<array.length;i++){
            array[i] =input.nextInt();

        }
        return array;


    }
    public int lastoccur(int[] array,int ele){
        int last_index =-1;
        for(int i =0;i<array.length;i++){
            if(array[i]==ele){
                last_index =i;
            }
        }
        return last_index;

    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner input = new Scanner(System.in);
        lastoccurence  obj =new lastoccurence();
        int[] array = obj.arrayCreation(input);
        System.out.println("enter the element that you want to check the last oxccurence or last index");
        int ele = input.nextInt();
        int index =obj.lastoccur(array,ele);
        System.out.println("the last occurence of the element in this arraty is "+index);
    
    }
}
