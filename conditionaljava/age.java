package conditionaljava;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the age of the ram");
        int ram =input.nextInt();
        System.out.println("enter the age of the shyam");
        int shyam =input.nextInt();
        System.out.println("enter the age of the jadu");
        int jadu = input.nextInt();
        if (ram > shyam) {
            if (ram >jadu) {
                System.out.println("ram is older");
                
            }
            else{
                System.out.println("jadu bisd older");
            }
            
        }
        else{
            if(shyam >jadu){
                System.out.println("shyam is older");
            }
            else{
                System.out.println("jadu is older");
            }

        }
    }
    
}
