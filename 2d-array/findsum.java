//here we also find the sum of rectangle  between two coordinate , using prefixsum rather than normal brute foce //technique 

import java.util.Scanner;

public class findsum {
    public static int[][] makePrefixSum(int[][]array){
        int row =array.length;
        int col =array[0].length;
        int [][] prefixsum =new int[row][col];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(j==0){
                    prefixsum[i][j] =array[i][j];

                }
                else{
                    prefixsum[i][j] =prefixsum[i][j-1]+array[i][j];
                }
            }
        }
        return prefixsum;
    }
    public static int findSum(int[][] array, int r1,int c1,int r2,int c2){
        int sum =0;
        int [][] prefixsum =makePrefixSum(array);
        for(int i =r1;i<=r2;i++){
            if(c1 ==0){
                sum+=prefixsum[i][c2];
            }
            else{
            sum +=prefixsum[i][c2] -prefixsum[i][c1-1];
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
       arrayInput obj = new arrayInput();
       Scanner input =new Scanner(System.in);
       int[][] array = obj.inputarray();
       obj.printArray(array);

       System.out.println("enter the row of the first ordinate");
       int r1 =input.nextInt();
       System.out.println("enter the column of the first coordinate ");
       int c1 =input.nextInt();
       System.out.println("enter the row of the 2nd cordinate ");
       int r2 =input.nextInt();
       System.out.println("ente the column of the 2nd cordinat ");
       int c2 =input.nextInt();
       int sum =findSum(array,r1,c1,r2,c2);
       System.out.println("the sumation of the rectangle is"+sum);


    }
    
}
