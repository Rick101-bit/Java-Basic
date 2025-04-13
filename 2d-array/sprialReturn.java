//write a program to print the element in a sprial manner 
public class sprialReturn {
    public static void sprialArray(int[][] array,int row,int col){
        int topRow =0,bottomRow =row -1,leftCol =0,rightCol =col-1;
        int totalElements = 0;
        while(totalElements<(row*col)){
            //top row = leftcol -->rightcol
            for(int j =leftCol;j<=rightCol&& totalElements<row*col;j++){
                System.out.print(array[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //right column = toprow -->bottomrow
            for(int i =topRow;i<=bottomRow && totalElements<row*col;i++){
                System.out.print(array[i][rightCol]+" ");
                totalElements++;

            }
            rightCol--;
            //bottomRow =rightcol -->leftCol
            for(int j =rightCol;j>=leftCol&& totalElements<row*col;j--){
                System.out.print(array[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow --;
            //leftcol =bottomrow -->toprow
            for(int i =bottomRow;i>=topRow&& totalElements<row*col;i--){
                System.out.print(array[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
         arrayInput obj = new arrayInput();
        int[][] array =obj.inputarray();
        obj.printArray(array);
        int row =obj.row;
        int col =obj.col;
        sprialArray(array,row,col);

        
    }

    
}
