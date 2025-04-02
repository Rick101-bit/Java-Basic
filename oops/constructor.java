package oops;

public class constructor {
    public class students{
        public String names;
        public int rolls;
        public double percents;
        students(String names, int rolls, double percents){
            this.names =names;
             this.rolls =rolls;
             this.percents = percents;

        }


    }
    public static void main(String[] args) {

        students s1 =new students("rick",24,78);
        System.out.println(s1.names);
        System.out.println(s1.rolls);

        
    }
    
}
