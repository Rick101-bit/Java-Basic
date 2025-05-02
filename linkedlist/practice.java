public class practice {
    public static class node{
        int data ;
        node next;
        node(int data){
            this.data =data;
            
        }
    }
    public static class linkedlist{
        node head =null;
        node tail =null;
        void insertAtEnd(int data){
            node temp =new node(data);
            if (head ==null) {
                head =temp;
                
            }
            else{
                tail.next =temp;
            }
            tail =temp;

        }
        void display(){
             node temp =head;
             while(temp !=null){
                System.out.println(temp.data);
                temp=temp.next;
             }
        }
        int size(){
            node temp =head;
            int count =0;
            while (temp!= null) {
                count++;
                temp =temp.next;

                
            }
            return count;
        }

    }
    public static void main(String[] args) {
        linkedlist ll  =new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.display();
        int size = ll.size();
        System.out.println("the size of the linked list is  "+size);
    }

    
}
