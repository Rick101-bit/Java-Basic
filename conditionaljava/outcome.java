package conditionaljava;
import java.util.Scanner;

public class outcome {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the buying cost of the seller");
    int cost1 = input.nextInt();
    System.out.println("enter the selling cost of the seller");
    int cost2 =input.nextInt();
    if(cost1<cost2){
        double profit =((double)(cost2-cost1)/cost1)*100;
        System.out.println(profit);
        System.out.println("you make a profit of "+profit+"%");
    }
    else if (cost1 ==cost2){
        System.out.println("ypou are not in profit or not in loss");

    }
    else{
        double loss =((double)(cost2-cost1)/cost1)*100;
        System.out.println("you make a loss of"+loss+"%");
    }
    
    
   }
    
    
}
