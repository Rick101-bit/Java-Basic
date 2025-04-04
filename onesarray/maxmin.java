public class maxmin {
    public static int max(int[] array){
        int max =Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            if(array[i]>max){
                max =array[i];
            }
        }
        return max;
    }
    public static int min(int[] array){
        int min =Integer.MAX_VALUE;
        for(int i =0;i<array.length;i++){
            if(array[i]<min){
               min = array[i];
            }

        }
        return min;

    }
    public static int second_max(int[]array){
        int max =max(array);
        for(int i =0;i<array.length;i++){
            if(array[i]==max){
                array[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax =max(array);
        return secondmax;
    }

    public static void main(String[] args) {
        arrayinputprint  obj =new arrayinputprint();
         int[] array =obj.arrayinput();
         obj.printArray(array);
         int max =max(array);
         System.out.println();
         System.out.println("the maximum element in the arraay is "+max);
         int min = min(array);
         System.out.println();
         System.out.println("the miunimum element of the array ia "+min);
         int second =second_max(array);
         System.out.println("the 2nd maximum element of the array is "+second);
        
    }
    
}
