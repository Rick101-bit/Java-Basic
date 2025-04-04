import java.util.Scanner;

public class tripletsum {
    public int[] arrayCreation(Scanner input){
        System.out.println("enter the size of the array :");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("enter the each element ");
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
    public int count(int[] array,int sum){
        int ans=0;
        for(int i =0;i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                for(int k =j+1;k<array.length;k++){
                    if(array[i]+array[j]+array[k]==sum){
                        ans++;

                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner input = new Scanner(System.in);
        tripletsum obj =new tripletsum();
        int[] array = obj.arrayCreation(input);
         obj.printArray(array);
        System.out.println();
        System.out.println("ente the triplets sum in the array ");
        int sum =input.nextInt();
        int count =obj.count(array, sum);
        System.out.println("the total nnumbe of triplet pair is "+count);
    }
}
