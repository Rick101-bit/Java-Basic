import java.util.Scanner;

public class targetsum {
   public static  int targetsumm(int[]array,int num){
    int ans = 0;
    for(int i =0;i<array.length;i++){
        for(int j =i+1;j<array.length;j++){
            if(array[i]+array[j]==num){
                ans++;

            }
        }
    }
    return ans;

    }
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        lastoccurence obj =new lastoccurence();
        Scanner input =new Scanner(System.in);
        int[]array =obj.arrayCreation(input);
        System.out.println("enter the sum of two value that you want to add :");
        int num =input.nextInt();
        int count =targetsumm(array,num);
        System.out.println("the total pair in the array is "+count);
    }
    
}
