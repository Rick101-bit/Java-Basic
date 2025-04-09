//create a program to generate the prefixsum of an array , means cumulative sum of an array , creating a new array 
public class prefixsum {
    public static int[] makePrefixSum(int[] array){
        int[] newarray = new int[array.length];
        newarray[0] =array[0];
        for(int i =1;i<array.length;i++){
            newarray[i] =newarray[i-1]+array[i];
        }
        return newarray;
    }
    public static void main(String[] args) {
        arrayinputprint obj = new arrayinputprint();
        int[] array = obj.arrayinput();
        obj.printArray(array);
        array =makePrefixSum(array);
        obj.printArray(array);
    }
    
}
