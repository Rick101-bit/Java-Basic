package string;

public class palindrome {
    public static void main(String[] args) {
        String str ="abcdcba";
        boolean flag =true;//palindrome
        int i =0;
        int j =str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag =false;
            }
            i++;
            j--;
        }
        if(flag == false){
            System.out.println("not palondrome");
        }
        else{
            System.out.println("palindrome");
        }

        }
    }
    

