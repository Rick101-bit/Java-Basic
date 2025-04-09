//this is the program to generate the prefixsum of an array , means sum of all elements in cumulative way
public class prefixsum2 {
    public static void prefixSum(int[] array){
        for(int i =1;i<array.length;i++){
            array[i] =array[i-1]+array[i];
        }
    }
    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        int[] array =obj.arrayinput();
        obj.printArray(array);
        prefixSum(array);
        obj.printArray(array);
    }
    
}
