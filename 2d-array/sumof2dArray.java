import java.util.Scanner;

public class sumof2dArray {
    public static void sumOfArray(int[][] array1,int[][] array2,arrayInput obj1,arrayInput obj2){
        int row1 =obj1.row;
        int col1 =obj1.col;
        int row2 =obj2.row;
        int col2 =obj2.col;
        int[][] sum = new int[row1][col1];
        if((row1 != row2) || (col1 !=col2)){
            System.out.println("addition is not posible :");
            return;

        }
        for(int i =0;i<row1;i++){
            for(int j =0;j<col1;j++){
                sum[i][j] = array1[i][j] +array2[i][j];

            }
        }
        obj1.printArray(sum);
     
    }
    public static void main(String[] args) {
        arrayInput obj1 =new arrayInput();
        arrayInput obj2 =new arrayInput();
        Scanner input = new Scanner(System.in);
        System.out.println("now give your requisities of first array :");
        int [][] array1 =obj1.inputarray();
        System.out.println("now give your requisitis of of second array : ");
        int[][] array2 =obj2.inputarray();
        obj1.printArray(array1);
        System.out.println();
        obj2.printArray(array2);
        sumOfArray(array1,array2,obj1,obj2);
        input.close();
        
    }
    
}
