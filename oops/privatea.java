package oops;


public class privatea {
    
    
    public static void main(String[] args) {
        privatea outer =new privatea();
        studebts x =new studebts();
        x.a =20;
        System.out.println(x.a);
        x.setname("rick");
         String z =x.getname();
         System.out.println(z);
         studebts y =new studebts();
         y.setname("ram");
         System.out.println(y.getname());
         



        
    }
}
