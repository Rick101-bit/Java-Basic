import java.util.Scanner;

public class sprialInput {
    public static int [][] sprialMatrix(int row,int col){
        int[][] sprialmatrix =new int[row][col];
        int topRow =0,bottomRow =row -1,leftCol =0,rightCol =col-1;
        int curr =1;
        while(curr<=(row*col)){
            //top row = leftcol -->rightcol
            for(int j =leftCol;j<=rightCol&& curr<=row*col;j++){
                sprialmatrix[topRow][j] =curr;
                curr++;
            }
            topRow++;
            //right column = toprow -->bottomrow
            for(int i =topRow;i<=bottomRow &&curr<=row*col;i++){
                sprialmatrix[i][rightCol]=curr;
               curr++;

            }
            rightCol--;
            //bottomRow =rightcol -->leftCol
            for(int j =rightCol;j>=leftCol&&curr<=row*col;j--){
                sprialmatrix[bottomRow][j] =curr;
               curr++;
            }
            bottomRow --;
            //leftcol =bottomrow -->toprow
            for(int i =bottomRow;i>=topRow&&curr<=row*col;i--){
                sprialmatrix[i][leftCol] =curr;
               curr++;
            }
            leftCol++;




        }
        return sprialmatrix;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row of the matrix:");
        int row =input.nextInt();
        System.out.println("enter the col of the matrix");
        int col = input.nextInt();
        int [][] matrix =sprialMatrix(row,col);
        arrayInput obj =new arrayInput();
        obj.printArray(matrix);
    }
    
}
