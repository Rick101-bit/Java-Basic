public class reverse2 {
    //reverse an array without creating any new array ,using temp variable
    public static void swaparray(int[] array,int i ,int j){
        int temp =array[i];
        array[i] =array[j];
        array[j]=temp;

    }
    static void reverse(int[] array){
        int i =0,j=array.length -1;
        while(i<j){
            swaparray(array,i,j);
            i++;
            j--;
        }


    }
    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
       int[] array = obj.arrayinput();
       obj.printArray(array);
       reverse(array);
       System.out.println("now the new array is");
       obj.printArray(array);
       
    }
}
