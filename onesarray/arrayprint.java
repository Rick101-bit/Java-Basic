package onesarray;
class array{
    void demoarray(){
        int[] array ={1,2,4,5,7,7};
        for(int i =0;i<array.length;i++){
            System.out.println("the 1d array is "+array[i]);
        }
        int[][] array2 ={{1,3,5,6},{3,5,7,8,9},{1,5,7,9}};
        for(int i =0;i<array2.length;i++){
            for(int j =0;j<array2[i].length;j++){
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
        int[][][] arr3 ={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        for(int i =0;i<arr3.length;i++){
            for(int j =0;j<arr3[i].length;i++){
                for(int k =0;k<arr3[j].length;k++){
                    System.out.println(arr3[i][j][k]);
                }
            }
        }

    }
}

public class arrayprint {
    public static void main(String[] args) {
       array obj =new array();
       obj.demoarray();
        
    }
    
}
