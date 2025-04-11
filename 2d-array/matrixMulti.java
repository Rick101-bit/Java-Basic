public class matrixMulti {
    public static void multiplyArray(int[][] array1,int[][] array2,arrayInput obj1,arrayInput obj2){
        
        int r1 =obj1.row;
        int c1 =obj1.col;
        int r2 =obj2.row;
        int c2 =obj2.col;
        int[][] multiArray =new int[r1][c2];
        if(c1 != r2){
            System.out.println("multiplication is not possible");
            return;
        }
        for(int i =0;i<r1;i++){
            for(int j =0;j<c2;j++){
                for(int k =0;k<c1;k++){
                    multiArray[i][j] +=array1[i][k]*array2[k][j];

                }
            }
        }
        obj1.printArray(multiArray);
    }
    public static void main(String[] args) {
        arrayInput obj1 = new arrayInput();
        arrayInput obj2 = new arrayInput();
        int[][] array1 = obj1.inputarray();
        int[][] array2 = obj2.inputarray();
        obj1.printArray(array1);
        obj2.printArray(array2);
        multiplyArray(array1,array2,obj1,obj2);

    }
    
}
