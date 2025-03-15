package loop;

public class program4 {
    public static void main(String[] args) {
        int x =4,y=0;
        while (x>=0) {
            --x;
            --y;
            System.out.println(x+y);
            if(x == y)
            continue;
            else
            System.out.println(x+" "+y);
            
        }
    }
    
}
