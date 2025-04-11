import java.util.Scanner;
public class arrayInput {
    public int row;
    public int col;
    @SuppressWarnings("resources")
    public int [][] inputarray(){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number of the row");
        row = input.nextInt();
        System.out.println("enter the number of the column ");
         col = input.nextInt();
        int [][] array =new int[row][col];
        System.out.println("now enter the element of the matrix");
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                array[i][j]=input.nextInt();
            }
        }
        return array;
        

    }
    public void printArray(int[][] array){
        System.out.println("now the final array is ");
        
        for(int i =0;i<array.length;i++){
            for(int j =0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }        
    }
    
}
