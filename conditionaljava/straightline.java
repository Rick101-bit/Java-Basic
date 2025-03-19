package conditionaljava;
//check that this three point are in straightline or not 

public class straightline {
    public static void main(String[] args) {
     float x1 = 1,y1 = 1,x2 =2,y2 =2,x3 =3,y3 =3;
     float m1 =(y2 - y1)/(x2-x1);
     float m2 =(y3 - y2)/(x3 - x2);
     if(m1 ==m2){
        System.out.println("this thre point are in straightline");
    }
     else{
        System.out.println("this three point are not in straightline");
    }
}
}
