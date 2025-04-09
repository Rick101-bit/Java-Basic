public class sortingArray {
    //write a program to sorting the values in non-decreasing order,given that array is sorted in non decreasing order, given that array may conntain negative element 
    public static int[] sortedd(int[] array){
        int[] newarray =new int[array.length];
        int i =0;
        int j =array.length -1;
        int k =0;
        while(i<=j){
            if(Math.abs(array[i])>Math.abs(array[j])){
                newarray[k++]=array[i]*array[i];
                i++;
            }
            else{
                newarray[k++]= array[j]*array[j];
                j--;
            }
        }

        return newarray;
    }
    public static void reverse(int[] newarray){
        int n =newarray.length -1;
        int[] temp =new int[newarray.length];
        for(int j= 0;j<newarray.length;j++){
            temp[j] =newarray[j];
        }
        int k =0;
        for(int i =n;i>=0;i--){
            newarray[k++]=temp[i];
        }
    }
    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        int[] array = obj.arrayinput();
        obj.printArray(array);
        int[] newarray =sortedd(array);
        obj.printArray(newarray);
        System.out.println();
        System.out.println("now the actual no decreasing array is ");
        reverse(newarray);
        obj.printArray(newarray);


        
    }
    
}
