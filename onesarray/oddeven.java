public class oddeven {
    public static void reverseOddEven(int[] array){
        int i =0;
        int j =array.length-1;
        while(i<j){
            if(array[i]%2 !=0 && array[j]%2 ==0){
                swap(array,i,j);
                i++;
                j--;
            }
            if(array[i]%2 ==0){
                i++;

            }
            if(array[j]%2 !=0){
                j--;
            }
        }
    }
    public static void swap(int[] array,int i,int j){
        int temp =array[i];
        array[i] =array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        int[] array =obj.arrayinput();
        obj.printArray(array);
        reverseOddEven(array);
        obj.printArray(array);

    }
}