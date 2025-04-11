public class transpose {
    public static int[][] transposeArray(int[][] array){
        int row =array.length;
        for(int i =0;i<row;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] =array[j][i];

            }
        }
        return array;
    }
    public static void main(String[] args) {
        arrayInput obj =new arrayInput();
        int[][] array =obj.inputarray();
        obj.printArray(array);
        int[][] transpose = transposeArray(array);
        obj.printArray(transpose);
    }
    
}
