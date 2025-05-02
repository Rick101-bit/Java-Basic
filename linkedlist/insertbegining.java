public class insertbegining {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }
    }
    public static  class linkedList{
        node head =null;
        node tail =null;
        void insertAtEnd(int data){
            node temp =new node(data);
            if(head ==null){
                head =temp;
                
            }else{
                tail.next = temp;
            }
            tail =temp;

        }
        void display(){
            node temp = head;
            while (temp !=null) {
                System.out.println(temp.data);
                temp =temp.next;
                
            }
            System.out.println();


        }
        void insertbegining(int data){
            node temp = new node(data);
            if(head ==null){
                head =tail=temp;
            }
            else{
                temp.next =head;
                head =temp;
            }
        }
        public static void main(String[] args) {
            linkedList ll =new linkedList();
            ll.insertAtEnd(3);
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(8);
            ll.display();
            ll.insertbegining(90);
            ll.display();
        }

    }
    
}
