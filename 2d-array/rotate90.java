public class rotate90 {
    public static int[][] rotate(int[][] array,arrayInput obj){
        array =makeTranspose(array,obj);
        return array;

    }
    public static int[][] makeTranspose(int[][] array,arrayInput obj){
        int r =obj.row;
        int c =obj.col;
        int[][] transArray =new int[c][r];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                transArray[i][j]=array[j][i];

            }
            reverseAray(transArray[i]);
        }
        return transArray;
       
    }
    public static void reverseAray(int[] transArray ){
        int i =0;
        int j =transArray.length -1;
        int temp =0;
        while(i<j){
            temp =transArray[i];
            transArray[i]=transArray[j];
            transArray[j]=temp;
            i++;
            j--;
            

        }
       

    }
    public static void main(String[] args) {
        arrayInput obj = new arrayInput();
        int [][] array =obj.inputarray();
        obj.printArray(array);
        array=rotate(array,obj);
        
        obj.printArray(array);
    }
    
}
