public class swapTranspose {
    //find out the transpose of array, using swapm case but it is on;y possible in square matrix , remenber it 
    public static int[][] swapUsingTranspose(int[][] array){
        int row =array.length;
        int temp =0;
        for(int i =0;i<row;i++){
            for(int j =i;j<array[i].length;j++){
                temp = array[i][j];
                array[i][j] =array[j][i];
                array[j][i]=temp;

            }
        }
        return array;
    }
    public static void main(String[] args) {
        arrayInput obj  =new arrayInput();
        int[][] array =obj.inputarray();
        obj.printArray(array);
        array =swapUsingTranspose(array);
        obj.printArray(array);
    }
    
}
