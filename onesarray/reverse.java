public class reverse {
    public static int[] reversearray(int[] array){
        int[] newarray = new int[array.length];
        int j =0;
        for(int i =array.length -1;i>=0;i--){
            newarray[j++] = array[i];

        }
        return newarray;
    }

    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        int[] array =obj.arrayinput();
        obj.printArray(array);
        array =reversearray(array);
        System.out.println();
        System.out.println("the reverse ar5ray is ");
        obj.printArray(array);

    }
    
}
