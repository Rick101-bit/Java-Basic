public class zeros {
    //let assume a array where all element s are in the form of 0 and 1 , so sort them 
    public static void  sorting(int[] array){
        int count=0;
        for(int i =0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        for(int i =0;i<array.length;i++){
            if(i<count){
                array[i]=0;
            }
            else{
                array[i]=1;
            }

        }
        

    }
    public static void main(String[] args) {
        arrayinputprint obj = new arrayinputprint();
        int[] array = obj.arrayinput();
        obj.printArray(array);
        sorting(array);
        obj.printArray(array);
    }
    
}
