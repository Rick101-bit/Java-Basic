public class repeat {
    // write a program to find out the element that are repeated and tyhe first element sholud be answer 
    public static int repeation(int[] array){
        int ele =0;//initialized because java does not allow returning an uninilializd local variable ,if th 
        //if condition is not satisfied then ele does not contain any value then return what ?
        for(int i =0;i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    ele =array[i];
                }
            }
        }
        return ele;
        
    }
    public static void main(String[] args) {
        arrayinputprint obj =new arrayinputprint();
        int[] array = obj.arrayinput();
        obj.printArray(array);
        System.out.println();
        System.out.println("this isw the first element that is repeated :");
        System.out.println(repeation(array));
    }
    
}
