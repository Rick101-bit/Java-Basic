public class implementation {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }

    }
    public static class linkedlist{
        node head =null;
        node tail =null;
        public  void insertAtEnd(int data){
            node temp =new node(data);
            if(head == null){
                head =temp;

            }
            else{
               tail.next =temp;
            }
            tail =temp;

        }
        void diaplay(){
            node  temp =head;
            while(head !=null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }


    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.diaplay();

    }
    
}
