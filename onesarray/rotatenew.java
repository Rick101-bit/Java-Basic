public class rotatenew {
    //rotate a array without creating extra space using swap 
    public static void reverse(int[] array){
        int i =0;
        int temp ;
        int j =array.length-1;
        while(i<j){
            temp =array[i];
            array[i] =array[j];
            array[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        int[] array =obj.arrayinput();
        obj.printArray(array);
        reverse(array,);
        obj.printArray(array);

    }
}
